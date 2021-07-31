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
  
  @scala.inline
  def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => Context,
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[js.Any],
    targetType: TargetType
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints.asInstanceOf[js.Any], contextInterceptor = js.Any.fromFunction1(contextInterceptor), isMultiInject = isMultiInject.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArgs]
  }
  
  @scala.inline
  implicit class NextArgsMutableBuilder[Self <: NextArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidConstraints(value: Boolean): Self = StObject.set(x, "avoidConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextInterceptor(value: Context => Context): Self = StObject.set(x, "contextInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMultiInject(value: Boolean): Self = StObject.set(x, "isMultiInject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setServiceIdentifier(value: ServiceIdentifier[js.Any]): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
