package typings.materialSegmentedButton

import typings.materialBase.componentMod.MDCComponent
import typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation
import typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment
import typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegmentFactory
import typings.materialSegmentedButton.typesMod.SegmentDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segmented-button/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCSegmentedButton () extends MDCComponent[MDCSegmentedButtonFoundation] {
    
    /**
      * @return Returns readonly list of selected child segments as SegmentDetails
      */
    def getSelectedSegments(): js.Array[SegmentDetail] = js.native
    
    var handleSelected: js.Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(segmentFactory: MDCSegmentedButtonSegmentFactory): Unit = js.native
    
    /**
      * @param segmentFactory Factory to create new child segments
      * @return Returns list of child segments found in DOM
      */
    var instantiateSegments: js.Any = js.native
    
    def isSegmentSelected(indexOrSegmentId: String): Boolean = js.native
    /**
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      * @return Returns true if identified child segment is currently selected,
      * otherwise returns false
      */
    def isSegmentSelected(indexOrSegmentId: Double): Boolean = js.native
    
    /**
      * @return Returns child segments mapped to readonly SegmentDetail list
      */
    var mappedSegments: js.Any = js.native
    
    var segmentFactory: js.Any = js.native
    
    def segments: js.Array[MDCSegmentedButtonSegment] = js.native
    
    var segments_ : js.Any = js.native
    
    def selectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified segment to be selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def selectSegment(indexOrSegmentId: Double): Unit = js.native
    
    def unselectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified segment to be not selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def unselectSegment(indexOrSegmentId: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSegmentedButton extends js.Object {
    
    def attachTo(root: Element): MDCSegmentedButton = js.native
  }
}
