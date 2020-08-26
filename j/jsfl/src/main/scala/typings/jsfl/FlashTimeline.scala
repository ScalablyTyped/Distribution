package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashTimeline extends js.Object {
  /** A zero-based index for the frame at the current */
  var currentFrame: Double = js.native
  /** A zero-based index for the currently active layer. */
  var currentLayer: Double = js.native
  /** Read-only; an integer that represents the number of */
  var frameCount: Double = js.native
  /** Read-only; an integer that represents the number of */
  var layerCount: Double = js.native
  /** Read-only; an array of layer objects. */
  var layers: js.Array[FlashLayer] = js.native
  var libraryItem: FlashItem = js.native
  /** A string that represents the name of the current */
  var name: String = js.native
  /** Adds a motion guide layer above the current layer and attaches the current layer to the newly added guide layer. */
  def addMotionGuide(): Double = js.native
  /**  Adds a new layer to the document and makes it the current layer. */
  def addNewLayer(): js.Any = js.native
  def addNewLayer(name: js.UndefOr[scala.Nothing], layerType: js.UndefOr[scala.Nothing], bAddAbove: Boolean): js.Any = js.native
  def addNewLayer(name: js.UndefOr[scala.Nothing], layerType: String): js.Any = js.native
  def addNewLayer(name: js.UndefOr[scala.Nothing], layerType: String, bAddAbove: Boolean): js.Any = js.native
  def addNewLayer(name: String): js.Any = js.native
  def addNewLayer(name: String, layerType: js.UndefOr[scala.Nothing], bAddAbove: Boolean): js.Any = js.native
  def addNewLayer(name: String, layerType: String): js.Any = js.native
  def addNewLayer(name: String, layerType: String, bAddAbove: Boolean): js.Any = js.native
  /** Deletes all the contents from a frame or range of frames on the current layer. */
  def clearFrames(): Unit = js.native
  def clearFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def clearFrames(startFrameIndex: Double): Unit = js.native
  def clearFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Converts a keyframe to a regular frame and deletes its contents on the current layer. */
  def clearKeyframes(): Unit = js.native
  def clearKeyframes(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def clearKeyframes(startFrameIndex: Double): Unit = js.native
  def clearKeyframes(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Converts frames to blank keyframes on the current layer. */
  def convertToBlankKeyframes(): Unit = js.native
  def convertToBlankKeyframes(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def convertToBlankKeyframes(startFrameIndex: Double): Unit = js.native
  def convertToBlankKeyframes(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Converts a range of frames to keyframes (or converts the selection if no frames are specified) on the current layer. */
  def convertToKeyframes(): Unit = js.native
  def convertToKeyframes(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def convertToKeyframes(startFrameIndex: Double): Unit = js.native
  def convertToKeyframes(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Copies a range of frames on the current layer to the clipboard. */
  def copyFrames(): Unit = js.native
  def copyFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def copyFrames(startFrameIndex: Double): Unit = js.native
  def copyFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Copies a range of Timeline layers to the clipboard. */
  def copyLayers(): Unit = js.native
  def copyLayers(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def copyLayers(startFrameIndex: Double): Unit = js.native
  def copyLayers(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Copies motion on selected frames, either from a motion tween or from frame - by - frame animation, so it can be applied to other frames. */
  def copyMotion(): Unit = js.native
  /** Copies motion on selected frames, either from a motion tween or from frame - by - frame animation, to the clipboard as ActionScript 3.0 code. */
  def copyMotionAsAS3(): Unit = js.native
  /** Creates a new motion object at a designated start and end frame. */
  def createMotionObject(): Unit = js.native
  def createMotionObject(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def createMotionObject(startFrameIndex: Double): Unit = js.native
  def createMotionObject(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Sets the frame.tweenType property to motion for each selected keyframe on the current layer, and converts each frame's contents to a single symbol instance if necessary. */
  def createMotionTween(): Unit = js.native
  def createMotionTween(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def createMotionTween(startFrameIndex: Double): Unit = js.native
  def createMotionTween(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Cuts a range of frames on the current layer from the timeline and saves them to the clipboard. */
  def cutFrames(): Unit = js.native
  def cutFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def cutFrames(startFrameIndex: Double): Unit = js.native
  def cutFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Cuts a range of Timeline layers and saves them to the clipboard. */
  def cutLayers(): Unit = js.native
  def cutLayers(startLayerIndex: js.UndefOr[scala.Nothing], endLayerIndex: Double): Unit = js.native
  def cutLayers(startLayerIndex: Double): Unit = js.native
  def cutLayers(startLayerIndex: Double, endLayerIndex: Double): Unit = js.native
  /** Deletes a layer. */
  def deleteLayer(index: Double): Unit = js.native
  /** Duplicates the selected layers or specified layers. */
  def duplicateLayers(): Unit = js.native
  def duplicateLayers(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def duplicateLayers(startFrameIndex: Double): Unit = js.native
  def duplicateLayers(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Expands or collapses the specified folder or folders. */
  def expandFolder(bExpand: Boolean): Unit = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: Boolean): Unit = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: Boolean, index: Double): Unit = js.native
  /** Finds an array of indexes for the layers with the given name. */
  def findLayerIndex(name: String): js.Array[Double] = js.native
  /** Retrieves the specified property's value for the selected frames. */
  def getFrameProperty(property: String): js.Any = js.native
  def getFrameProperty(property: String, startframeIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): js.Any = js.native
  def getFrameProperty(property: String, startframeIndex: Double): js.Any = js.native
  def getFrameProperty(property: String, startframeIndex: Double, endFrameIndex: Double): js.Any = js.native
  /** Returns an XML string that represents the current positions of the horizontal and vertical guide lines for a timeline(View > Guides > Show Guides). */
  def getGuidelines(): String = js.native
  /** Retrieves the specified property's value for the selected layers. */
  def getLayerProperty(property: String): js.Any = js.native
  /** Retrieves the currently selected frames in an array. */
  def getSelectedFrames(): js.Array[FlashFrame] = js.native
  /** Retrieves the zero - based index values of the currently selected layers. */
  def getSelectedLayers(): js.Array[FlashLayer] = js.native
  /** Inserts a blank keyframe at the specified frame index; if the index is not specified, inserts the blank keyframe by using the playhead / selection. */
  def insertBlankKeyframe(): Unit = js.native
  def insertBlankKeyframe(frameNumIndex: Double): Unit = js.native
  /** Inserts the specified number of frames at the given frame number. */
  def insertFrames(): Unit = js.native
  def insertFrames(numFrames: js.UndefOr[scala.Nothing], bAllLayers: js.UndefOr[scala.Nothing], frameNumIndex: Double): Unit = js.native
  def insertFrames(numFrames: js.UndefOr[scala.Nothing], bAllLayers: Boolean): Unit = js.native
  def insertFrames(numFrames: js.UndefOr[scala.Nothing], bAllLayers: Boolean, frameNumIndex: Double): Unit = js.native
  def insertFrames(numFrames: Double): Unit = js.native
  def insertFrames(numFrames: Double, bAllLayers: js.UndefOr[scala.Nothing], frameNumIndex: Double): Unit = js.native
  def insertFrames(numFrames: Double, bAllLayers: Boolean): Unit = js.native
  def insertFrames(numFrames: Double, bAllLayers: Boolean, frameNumIndex: Double): Unit = js.native
  /** Inserts a keyframe at the specified frame. */
  def insertKeyframe(): Unit = js.native
  def insertKeyframe(frameNumIndex: Double): Unit = js.native
  /** Pastes the range of frames from the clipboard into the specified frames. */
  def pasteFrames(): Unit = js.native
  def pasteFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def pasteFrames(startFrameIndex: Double): Unit = js.native
  def pasteFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Pastes copied layers to the Timeline above the specified layer index. */
  def pasteLayers(layerIndex: Double): Double = js.native
  /** Pastes the range of motion frames retrieved by */
  def pasteMotion(): Unit = js.native
  /** Deletes the frame. */
  def removeFrames(): Unit = js.native
  def removeFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def removeFrames(startFrameIndex: Double): Unit = js.native
  def removeFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Removes the motion object created with timeline.createMotionObject(), and converts the frame(s) to static frames. */
  def removeMotionObject(startFrame: Double, endFrame: Double): Unit = js.native
  /** Moves the first specified layer before or after the second specified layer. */
  def reorderLayer(layerToMove: Double, layerToPutItBy: Double): Unit = js.native
  def reorderLayer(layerToMove: Double, layerToPutItBy: Double, bAddBefore: Boolean): Unit = js.native
  /** Reverses a range of frames. */
  def reverseFrames(): Unit = js.native
  def reverseFrames(startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def reverseFrames(startFrameIndex: Double): Unit = js.native
  def reverseFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Selects all the frames in the current timeline. */
  def selectAllFrames(): Unit = js.native
  /** Sets the property of the Frame object for the selected frames. */
  def setFrameProperty(property: String, value: js.Any): Unit = js.native
  def setFrameProperty(property: String, value: js.Any, startFrameIndex: js.UndefOr[scala.Nothing], endFrameIndex: Double): Unit = js.native
  def setFrameProperty(property: String, value: js.Any, startFrameIndex: Double): Unit = js.native
  def setFrameProperty(property: String, value: js.Any, startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  /** Replaces the guide lines for the timeline with the information specified. */
  def setGuidelines(xmlString: String): Boolean = js.native
  /** Sets the specified property on all the selected layers to a specified value. */
  def setLayerProperty(property: String, value: js.Any): Unit = js.native
  def setLayerProperty(property: String, value: js.Any, layersToChange: String): Unit = js.native
  def setSelectedFrames(selectionList: js.Array[Double]): Unit = js.native
  def setSelectedFrames(selectionList: js.Array[Double], bReplaceCurrentSelection: Boolean): Unit = js.native
  /** Selects a range of frames in the current layer or sets the selected frames to the selection array passed into this method. */
  def setSelectedFrames(startFrameIndex: Double, endFrameIndex: Double): Unit = js.native
  def setSelectedFrames(startFrameIndex: Double, endFrameIndex: Double, bReplaceCurrentSelection: Boolean): Unit = js.native
  /** Sets the layer to be selected; also makes the specified layer the current layer. */
  def setSelectedLayers(index: Double): Unit = js.native
  def setSelectedLayers(index: Double, bReplaceCurrentSelection: Boolean): Unit = js.native
  /** Shows the layer masking during authoring by locking the mask and masked layers. */
  def showLayerMasking(layer: Double): Unit = js.native
  /** Starts automatic playback of the timeline if it is not currently playing. */
  def startPlayback(): Unit = js.native
  /** Stops autoumatic playback of the timeline if it is currently playing. */
  def stopPlayback(): Unit = js.native
}

