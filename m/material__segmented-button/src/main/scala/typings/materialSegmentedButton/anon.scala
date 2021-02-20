package typings.materialSegmentedButton

import typings.materialSegmentedButton.typesMod.SegmentDetail
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segmented-button/adapter.MDCSegmentedButtonAdapter> */
  @js.native
  trait PartialMDCSegmentedButton extends StObject {
    
    var getSegments: js.UndefOr[js.Function0[js.Array[SegmentDetail]]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var notifySelectedChange: js.UndefOr[js.Function1[/* detail */ SegmentDetail, Unit]] = js.native
    
    var selectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.native
    
    var unselectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.native
  }
  object PartialMDCSegmentedButton {
    
    @scala.inline
    def apply(): PartialMDCSegmentedButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSegmentedButton]
    }
    
    @scala.inline
    implicit class PartialMDCSegmentedButtonMutableBuilder[Self <: PartialMDCSegmentedButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSegments(value: () => js.Array[SegmentDetail]): Self = StObject.set(x, "getSegments", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSegmentsUndefined: Self = StObject.set(x, "getSegments", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setNotifySelectedChange(value: /* detail */ SegmentDetail => Unit): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifySelectedChangeUndefined: Self = StObject.set(x, "notifySelectedChange", js.undefined)
      
      @scala.inline
      def setSelectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = StObject.set(x, "selectSegment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectSegmentUndefined: Self = StObject.set(x, "selectSegment", js.undefined)
      
      @scala.inline
      def setUnselectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = StObject.set(x, "unselectSegment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnselectSegmentUndefined: Self = StObject.set(x, "unselectSegment", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segment/adapter.MDCSegmentedButtonSegmentAdapter> */
  @js.native
  trait PartialMDCSegmentedButtonAddClass extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var getAttr: js.UndefOr[js.Function1[/* attrName */ String, String | Null]] = js.native
    
    var getRootBoundingClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var isSingleSelect: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var notifySelectedChange: js.UndefOr[js.Function1[/* selected */ Boolean, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCSegmentedButtonAddClass {
    
    @scala.inline
    def apply(): PartialMDCSegmentedButtonAddClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSegmentedButtonAddClass]
    }
    
    @scala.inline
    implicit class PartialMDCSegmentedButtonAddClassMutableBuilder[Self <: PartialMDCSegmentedButtonAddClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setGetAttr(value: /* attrName */ String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttrUndefined: Self = StObject.set(x, "getAttr", js.undefined)
      
      @scala.inline
      def setGetRootBoundingClientRect(value: () => ClientRect): Self = StObject.set(x, "getRootBoundingClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootBoundingClientRectUndefined: Self = StObject.set(x, "getRootBoundingClientRect", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setIsSingleSelect(value: () => Boolean): Self = StObject.set(x, "isSingleSelect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSingleSelectUndefined: Self = StObject.set(x, "isSingleSelect", js.undefined)
      
      @scala.inline
      def setNotifySelectedChange(value: /* selected */ Boolean => Unit): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifySelectedChangeUndefined: Self = StObject.set(x, "notifySelectedChange", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetAttr(value: (/* attrName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    }
  }
}
