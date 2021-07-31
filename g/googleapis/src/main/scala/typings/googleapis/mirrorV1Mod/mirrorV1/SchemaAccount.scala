package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an account passed into the Account Manager on Glass.
  */
trait SchemaAccount extends StObject {
  
  var authTokens: js.UndefOr[js.Array[SchemaAuthToken]] = js.undefined
  
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var userData: js.UndefOr[js.Array[SchemaUserData]] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthTokens(value: js.Array[SchemaAuthToken]): Self = StObject.set(x, "authTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokensUndefined: Self = StObject.set(x, "authTokens", js.undefined)
    
    @scala.inline
    def setAuthTokensVarargs(value: SchemaAuthToken*): Self = StObject.set(x, "authTokens", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Array[SchemaUserData]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    @scala.inline
    def setUserDataVarargs(value: SchemaUserData*): Self = StObject.set(x, "userData", js.Array(value :_*))
  }
}
