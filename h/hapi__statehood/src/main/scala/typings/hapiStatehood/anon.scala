package typings.hapiStatehood

import typings.hapiIron.mod.SealOptionsSub
import typings.hapiStatehood.mod.StateOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Failed[HapiRequest] extends StObject {
    
    var failed: js.Array[Name[HapiRequest]]
    
    var states: Record[String, String]
  }
  object Failed {
    
    inline def apply[HapiRequest](failed: js.Array[Name[HapiRequest]], states: Record[String, String]): Failed[HapiRequest] = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failed[HapiRequest]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Failed[?], HapiRequest] (val x: Self & Failed[HapiRequest]) extends AnyVal {
      
      inline def setFailed(value: js.Array[Name[HapiRequest]]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: Name[HapiRequest]*): Self = StObject.set(x, "failed", js.Array(value*))
      
      inline def setStates(value: Record[String, String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  trait Integrity extends StObject {
    
    /**
      * Algorithm options.
      */
    var integrity: js.UndefOr[SealOptionsSub] = js.undefined
    
    /**
      * Password used for HMAC key generation (must be at least 32 characters long).
      */
    var password: String
  }
  object Integrity {
    
    inline def apply(password: String): Integrity = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integrity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Integrity] (val x: Self) extends AnyVal {
      
      inline def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[HapiRequest] extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var reason: String
    
    var settings: StateOptions[HapiRequest]
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply[HapiRequest](reason: String, settings: StateOptions[HapiRequest]): Name[HapiRequest] = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[HapiRequest]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name[?], HapiRequest] (val x: Self & Name[HapiRequest]) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: StateOptions[HapiRequest]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
