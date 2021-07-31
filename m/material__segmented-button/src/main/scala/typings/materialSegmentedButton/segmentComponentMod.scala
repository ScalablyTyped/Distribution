package typings.materialSegmentedButton

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/segmented-button/segment/component", "MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected () extends MDCComponent[MDCSegmentedButtonSegmentFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCSegmentedButtonSegmentFoundation, args: js.Any*) = this()
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @return Returns segment's segmentId if it was set by client
      */
    def getSegmentId(): js.UndefOr[String] = js.native
    
    var handleClick: js.Any = js.native
    
    var index: js.Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    /**
      * @return Returns true if segment is currently selected, otherwise returns
      * false
      */
    def isSelected(): Boolean = js.native
    
    var isSingleSelect: js.Any = js.native
    
    def ripple: MDCRipple = js.native
    
    var rippleComponent: js.Any = js.native
    
    /**
      * Sets segment's index value
      *
      * @param index Segment's index within wrapping segmented button
      */
    def setIndex(index: Double): Unit = js.native
    
    /**
      * Sets segment's isSingleSelect value
      *
      * @param isSingleSelect True if wrapping segmented button is single select
      */
    def setIsSingleSelect(isSingleSelect: Boolean): Unit = js.native
    
    /**
      * Sets segment to be selected
      */
    def setSelected(): Unit = js.native
    
    /**
      * Sets segment to be not selected
      */
    def setUnselected(): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button/segment/component", "MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSegmentedButtonSegment]
  }
  
  type MDCSegmentedButtonSegmentFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSegmentedButtonSegmentFoundation], 
    MDCSegmentedButtonSegment
  ]
}
