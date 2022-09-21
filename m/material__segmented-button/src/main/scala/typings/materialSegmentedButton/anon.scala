package typings.materialSegmentedButton

import typings.materialSegmentedButton.typesMod.SegmentDetail
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segmented-button/adapter.MDCSegmentedButtonAdapter> */
  trait PartialMDCSegmentedButton extends StObject {
    
    var getSegments: js.UndefOr[js.Function0[js.Array[SegmentDetail]]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifySelectedChange: js.UndefOr[js.Function1[/* detail */ SegmentDetail, Unit]] = js.undefined
    
    var selectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.undefined
    
    var unselectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.undefined
  }
  object PartialMDCSegmentedButton {
    
    inline def apply(): PartialMDCSegmentedButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSegmentedButton]
    }
    
    extension [Self <: PartialMDCSegmentedButton](x: Self) {
      
      inline def setGetSegments(value: () => js.Array[SegmentDetail]): Self = StObject.set(x, "getSegments", js.Any.fromFunction0(value))
      
      inline def setGetSegmentsUndefined: Self = StObject.set(x, "getSegments", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setNotifySelectedChange(value: /* detail */ SegmentDetail => Unit): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1(value))
      
      inline def setNotifySelectedChangeUndefined: Self = StObject.set(x, "notifySelectedChange", js.undefined)
      
      inline def setSelectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = StObject.set(x, "selectSegment", js.Any.fromFunction1(value))
      
      inline def setSelectSegmentUndefined: Self = StObject.set(x, "selectSegment", js.undefined)
      
      inline def setUnselectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = StObject.set(x, "unselectSegment", js.Any.fromFunction1(value))
      
      inline def setUnselectSegmentUndefined: Self = StObject.set(x, "unselectSegment", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segment/adapter.MDCSegmentedButtonSegmentAdapter> */
  trait PartialMDCSegmentedButtonAddClass extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getAttr: js.UndefOr[js.Function1[/* attrName */ String, String | Null]] = js.undefined
    
    var getRootBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var isSingleSelect: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifySelectedChange: js.UndefOr[js.Function1[/* selected */ Boolean, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCSegmentedButtonAddClass {
    
    inline def apply(): PartialMDCSegmentedButtonAddClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSegmentedButtonAddClass]
    }
    
    extension [Self <: PartialMDCSegmentedButtonAddClass](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetAttr(value: /* attrName */ String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setGetAttrUndefined: Self = StObject.set(x, "getAttr", js.undefined)
      
      inline def setGetRootBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getRootBoundingClientRect", js.Any.fromFunction0(value))
      
      inline def setGetRootBoundingClientRectUndefined: Self = StObject.set(x, "getRootBoundingClientRect", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsSingleSelect(value: () => Boolean): Self = StObject.set(x, "isSingleSelect", js.Any.fromFunction0(value))
      
      inline def setIsSingleSelectUndefined: Self = StObject.set(x, "isSingleSelect", js.undefined)
      
      inline def setNotifySelectedChange(value: /* selected */ Boolean => Unit): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1(value))
      
      inline def setNotifySelectedChangeUndefined: Self = StObject.set(x, "notifySelectedChange", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttr(value: (/* attrName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      inline def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    }
  }
}
