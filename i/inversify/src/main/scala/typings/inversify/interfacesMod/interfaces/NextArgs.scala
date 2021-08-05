package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextArgs extends StObject {
  
  var avoidConstraints: Boolean
  
  def contextInterceptor(contexts: Context): Context
  
  var isMultiInject: Boolean
  
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  
  var serviceIdentifier: ServiceIdentifier[js.Any]
  
  var targetType: TargetType
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object NextArgs {
  
  inline def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => Context,
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[js.Any],
    targetType: TargetType
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints.asInstanceOf[js.Any], contextInterceptor = js.Any.fromFunction1(contextInterceptor), isMultiInject = isMultiInject.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArgs]
  }
  
  extension [Self <: NextArgs](x: Self) {
    
    inline def setAvoidConstraints(value: Boolean): Self = StObject.set(x, "avoidConstraints", value.asInstanceOf[js.Any])
    
    inline def setContextInterceptor(value: Context => Context): Self = StObject.set(x, "contextInterceptor", js.Any.fromFunction1(value))
    
    inline def setIsMultiInject(value: Boolean): Self = StObject.set(x, "isMultiInject", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setServiceIdentifier(value: ServiceIdentifier[js.Any]): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
