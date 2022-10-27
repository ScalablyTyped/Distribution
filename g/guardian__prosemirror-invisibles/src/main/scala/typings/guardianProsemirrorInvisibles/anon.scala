package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.NODE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CHAR extends StObject {
    
    val CHAR: typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.CHAR
    
    val NODE: typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.NODE
  }
  object CHAR {
    
    inline def apply(): CHAR = {
      val __obj = js.Dynamic.literal(CHAR = "CHAR", NODE = "NODE")
      __obj.asInstanceOf[CHAR]
    }
    
    extension [Self <: CHAR](x: Self) {
      
      inline def setCHAR(value: typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.CHAR): Self = StObject.set(x, "CHAR", value.asInstanceOf[js.Any])
      
      inline def setNODE(value: NODE): Self = StObject.set(x, "NODE", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsActive extends StObject {
    
    var isActive: Boolean
  }
  object IsActive {
    
    inline def apply(isActive: Boolean): IsActive = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsActive]
    }
    
    extension [Self <: IsActive](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var payload: IsActive
    
    var `type`: String
  }
  object Payload {
    
    inline def apply(payload: IsActive, `type`: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: IsActive): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
