package typings.materialSelect

import typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCSelectEvent extends Event {
    
    val detail: MDCSelectEventDetail = js.native
  }
  
  @js.native
  trait MDCSelectEventDetail extends StObject {
    
    var index: Double = js.native
    
    var value: String = js.native
  }
  object MDCSelectEventDetail {
    
    @scala.inline
    def apply(index: Double, value: String): MDCSelectEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSelectEventDetail]
    }
    
    @scala.inline
    implicit class MDCSelectEventDetailMutableBuilder[Self <: MDCSelectEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCSelectFoundationMap extends StObject {
    
    var helperText: MDCSelectHelperTextFoundation = js.native
    
    var leadingIcon: MDCSelectIconFoundation = js.native
  }
  object MDCSelectFoundationMap {
    
    @scala.inline
    def apply(helperText: MDCSelectHelperTextFoundation, leadingIcon: MDCSelectIconFoundation): MDCSelectFoundationMap = {
      val __obj = js.Dynamic.literal(helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSelectFoundationMap]
    }
    
    @scala.inline
    implicit class MDCSelectFoundationMapMutableBuilder[Self <: MDCSelectFoundationMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelperText(value: MDCSelectHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingIcon(value: MDCSelectIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
    }
  }
}
