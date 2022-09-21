package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppKey extends StObject {
  
  var appKey: String
  
  var production: Boolean
  
  var titchannelle: String
}
object AppKey {
  
  inline def apply(appKey: String, production: Boolean, titchannelle: String): AppKey = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], titchannelle = titchannelle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppKey]
  }
  
  extension [Self <: AppKey](x: Self) {
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setTitchannelle(value: String): Self = StObject.set(x, "titchannelle", value.asInstanceOf[js.Any])
  }
}
