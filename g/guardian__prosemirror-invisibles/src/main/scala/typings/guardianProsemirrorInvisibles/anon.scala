package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.BLUR_DOCUMENT
import typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.NODE
import typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.SET_SHOW_INVISIBLES_STATE
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
  
  trait IsFocused extends StObject {
    
    var isFocused: Boolean
  }
  object IsFocused {
    
    inline def apply(isFocused: Boolean): IsFocused = {
      val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsFocused]
    }
    
    extension [Self <: IsFocused](x: Self) {
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var payload: ShouldShowInvisibles
    
    var `type`: SET_SHOW_INVISIBLES_STATE
  }
  object Payload {
    
    inline def apply(payload: ShouldShowInvisibles): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_SHOW_INVISIBLES_STATE")
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: ShouldShowInvisibles): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: SET_SHOW_INVISIBLES_STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShouldShowInvisibles extends StObject {
    
    var shouldShowInvisibles: Boolean
  }
  object ShouldShowInvisibles {
    
    inline def apply(shouldShowInvisibles: Boolean): ShouldShowInvisibles = {
      val __obj = js.Dynamic.literal(shouldShowInvisibles = shouldShowInvisibles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShouldShowInvisibles]
    }
    
    extension [Self <: ShouldShowInvisibles](x: Self) {
      
      inline def setShouldShowInvisibles(value: Boolean): Self = StObject.set(x, "shouldShowInvisibles", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var payload: IsFocused
    
    var `type`: BLUR_DOCUMENT
  }
  object Type {
    
    inline def apply(payload: IsFocused): Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BLUR_DOCUMENT")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setPayload(value: IsFocused): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: BLUR_DOCUMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
