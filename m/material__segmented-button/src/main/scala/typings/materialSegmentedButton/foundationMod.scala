package typings.materialSegmentedButton

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSegmentedButton.adapterMod.MDCSegmentedButtonAdapter
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.typesMod.SegmentDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/segmented-button/segmented-button/foundation", "MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation () extends MDCFoundation[MDCSegmentedButtonAdapter] {
    def this(adapter: PartialMDCSegmentedButton) = this()
    
    /**
      * @return Returns currently selected child segments as readonly list of
      * SegmentDetails
      */
    def getSelectedSegments(): js.Array[SegmentDetail] = js.native
    
    /**
      * Called when child segment's selected status may have changed. If segmented
      * button is single select, unselects all child segments other than identified
      * child segment. Finally, emits event to client.
      *
      * @param detail Child segment affected represented as SegmentDetail
      * @event change With detail - SegmentDetail
      */
    def handleSelected(detail: SegmentDetail): Unit = js.native
    
    def isSegmentSelected(indexOrSegmentId: String): Boolean = js.native
    /**
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      * @return Returns true if identified child segment is currently selected,
      * otherwise returns false
      */
    def isSegmentSelected(indexOrSegmentId: Double): Boolean = js.native
    
    /**
      * @return Returns true if segmented button is single select, otherwise
      * returns false
      */
    def isSingleSelect(): Boolean = js.native
    
    def selectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified child segment to be selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def selectSegment(indexOrSegmentId: Double): Unit = js.native
    
    /**
      * Sets all child segments to be not selected except for child segment
      * identified by index
      *
      * @param index Index of child segment to not unselect
      */
    var unselectPrevSelected: js.Any = js.native
    
    def unselectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified child segment to be not selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def unselectSegment(indexOrSegmentId: Double): Unit = js.native
  }
}
