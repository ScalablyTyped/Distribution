package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashTimeline extends js.Object {
  /** A zero-based index for the frame at the current */
  var currentFrame: scala.Double = js.native
  /** A zero-based index for the currently active layer. */
  var currentLayer: scala.Double = js.native
  /** Read-only; an integer that represents the number of */
  var frameCount: scala.Double = js.native
  /** Read-only; an integer that represents the number of */
  var layerCount: scala.Double = js.native
  /** Read-only; an array of layer objects. */
  var layers: js.Array[FlashLayer] = js.native
  var libraryItem: FlashItem = js.native
  /** A string that represents the name of the current */
  var name: java.lang.String = js.native
  /** Adds a motion guide layer above the current layer and attaches the current layer to the newly added guide layer. */
  def addMotionGuide(): scala.Double = js.native
  /**  Adds a new layer to the document and makes it the current layer. */
  def addNewLayer(): js.Any = js.native
  /**  Adds a new layer to the document and makes it the current layer. */
  def addNewLayer(name: java.lang.String): js.Any = js.native
  /**  Adds a new layer to the document and makes it the current layer. */
  def addNewLayer(name: java.lang.String, layerType: java.lang.String): js.Any = js.native
  /**  Adds a new layer to the document and makes it the current layer. */
  def addNewLayer(name: java.lang.String, layerType: java.lang.String, bAddAbove: scala.Boolean): js.Any = js.native
  /** Deletes all the contents from a frame or range of frames on the current layer. */
  def clearFrames(): scala.Unit = js.native
  /** Deletes all the contents from a frame or range of frames on the current layer. */
  def clearFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Deletes all the contents from a frame or range of frames on the current layer. */
  def clearFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts a keyframe to a regular frame and deletes its contents on the current layer. */
  def clearKeyframes(): scala.Unit = js.native
  /** Converts a keyframe to a regular frame and deletes its contents on the current layer. */
  def clearKeyframes(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts a keyframe to a regular frame and deletes its contents on the current layer. */
  def clearKeyframes(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts frames to blank keyframes on the current layer. */
  def convertToBlankKeyframes(): scala.Unit = js.native
  /** Converts frames to blank keyframes on the current layer. */
  def convertToBlankKeyframes(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts frames to blank keyframes on the current layer. */
  def convertToBlankKeyframes(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts a range of frames to keyframes (or converts the selection if no frames are specified) on the current layer. */
  def convertToKeyframes(): scala.Unit = js.native
  /** Converts a range of frames to keyframes (or converts the selection if no frames are specified) on the current layer. */
  def convertToKeyframes(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Converts a range of frames to keyframes (or converts the selection if no frames are specified) on the current layer. */
  def convertToKeyframes(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Copies a range of frames on the current layer to the clipboard. */
  def copyFrames(): scala.Unit = js.native
  /** Copies a range of frames on the current layer to the clipboard. */
  def copyFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Copies a range of frames on the current layer to the clipboard. */
  def copyFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Copies a range of Timeline layers to the clipboard. */
  def copyLayers(): scala.Unit = js.native
  /** Copies a range of Timeline layers to the clipboard. */
  def copyLayers(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Copies a range of Timeline layers to the clipboard. */
  def copyLayers(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Copies motion on selected frames, either from a motion tween or from frame - by - frame animation, so it can be applied to other frames. */
  def copyMotion(): scala.Unit = js.native
  /** Copies motion on selected frames, either from a motion tween or from frame - by - frame animation, to the clipboard as ActionScript 3.0 code. */
  def copyMotionAsAS3(): scala.Unit = js.native
  /** Creates a new motion object at a designated start and end frame. */
  def createMotionObject(): scala.Unit = js.native
  /** Creates a new motion object at a designated start and end frame. */
  def createMotionObject(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Creates a new motion object at a designated start and end frame. */
  def createMotionObject(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Sets the frame.tweenType property to motion for each selected keyframe on the current layer, and converts each frame's contents to a single symbol instance if necessary. */
  def createMotionTween(): scala.Unit = js.native
  /** Sets the frame.tweenType property to motion for each selected keyframe on the current layer, and converts each frame's contents to a single symbol instance if necessary. */
  def createMotionTween(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Sets the frame.tweenType property to motion for each selected keyframe on the current layer, and converts each frame's contents to a single symbol instance if necessary. */
  def createMotionTween(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Cuts a range of frames on the current layer from the timeline and saves them to the clipboard. */
  def cutFrames(): scala.Unit = js.native
  /** Cuts a range of frames on the current layer from the timeline and saves them to the clipboard. */
  def cutFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Cuts a range of frames on the current layer from the timeline and saves them to the clipboard. */
  def cutFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Cuts a range of Timeline layers and saves them to the clipboard. */
  def cutLayers(): scala.Unit = js.native
  /** Cuts a range of Timeline layers and saves them to the clipboard. */
  def cutLayers(startLayerIndex: scala.Double): scala.Unit = js.native
  /** Cuts a range of Timeline layers and saves them to the clipboard. */
  def cutLayers(startLayerIndex: scala.Double, endLayerIndex: scala.Double): scala.Unit = js.native
  /** Deletes a layer. */
  def deleteLayer(index: scala.Double): scala.Unit = js.native
  /** Duplicates the selected layers or specified layers. */
  def duplicateLayers(): scala.Unit = js.native
  /** Duplicates the selected layers or specified layers. */
  def duplicateLayers(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Duplicates the selected layers or specified layers. */
  def duplicateLayers(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Expands or collapses the specified folder or folders. */
  def expandFolder(bExpand: scala.Boolean): scala.Unit = js.native
  /** Expands or collapses the specified folder or folders. */
  def expandFolder(bExpand: scala.Boolean, bRecurseNestedParents: scala.Boolean): scala.Unit = js.native
  /** Expands or collapses the specified folder or folders. */
  def expandFolder(bExpand: scala.Boolean, bRecurseNestedParents: scala.Boolean, index: scala.Double): scala.Unit = js.native
  /** Finds an array of indexes for the layers with the given name. */
  def findLayerIndex(name: java.lang.String): js.Array[scala.Double] = js.native
  /** Retrieves the specified property's value for the selected frames. */
  def getFrameProperty(property: java.lang.String): js.Any = js.native
  /** Retrieves the specified property's value for the selected frames. */
  def getFrameProperty(property: java.lang.String, startframeIndex: scala.Double): js.Any = js.native
  /** Retrieves the specified property's value for the selected frames. */
  def getFrameProperty(property: java.lang.String, startframeIndex: scala.Double, endFrameIndex: scala.Double): js.Any = js.native
  /** Returns an XML string that represents the current positions of the horizontal and vertical guide lines for a timeline(View > Guides > Show Guides). */
  def getGuidelines(): java.lang.String = js.native
  /** Retrieves the specified property's value for the selected layers. */
  def getLayerProperty(property: java.lang.String): js.Any = js.native
  /** Retrieves the currently selected frames in an array. */
  def getSelectedFrames(): js.Array[FlashFrame] = js.native
  /** Retrieves the zero - based index values of the currently selected layers. */
  def getSelectedLayers(): js.Array[FlashLayer] = js.native
  /** Inserts a blank keyframe at the specified frame index; if the index is not specified, inserts the blank keyframe by using the playhead / selection. */
  def insertBlankKeyframe(): scala.Unit = js.native
  /** Inserts a blank keyframe at the specified frame index; if the index is not specified, inserts the blank keyframe by using the playhead / selection. */
  def insertBlankKeyframe(frameNumIndex: scala.Double): scala.Unit = js.native
  /** Inserts the specified number of frames at the given frame number. */
  def insertFrames(): scala.Unit = js.native
  /** Inserts the specified number of frames at the given frame number. */
  def insertFrames(numFrames: scala.Double): scala.Unit = js.native
  /** Inserts the specified number of frames at the given frame number. */
  def insertFrames(numFrames: scala.Double, bAllLayers: scala.Boolean): scala.Unit = js.native
  /** Inserts the specified number of frames at the given frame number. */
  def insertFrames(numFrames: scala.Double, bAllLayers: scala.Boolean, frameNumIndex: scala.Double): scala.Unit = js.native
  /** Inserts a keyframe at the specified frame. */
  def insertKeyframe(): scala.Unit = js.native
  /** Inserts a keyframe at the specified frame. */
  def insertKeyframe(frameNumIndex: scala.Double): scala.Unit = js.native
  /** Pastes the range of frames from the clipboard into the specified frames. */
  def pasteFrames(): scala.Unit = js.native
  /** Pastes the range of frames from the clipboard into the specified frames. */
  def pasteFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Pastes the range of frames from the clipboard into the specified frames. */
  def pasteFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Pastes copied layers to the Timeline above the specified layer index. */
  def pasteLayers(layerIndex: scala.Double): scala.Double = js.native
  /** Pastes the range of motion frames retrieved by */
  def pasteMotion(): scala.Unit = js.native
  /** Deletes the frame. */
  def removeFrames(): scala.Unit = js.native
  /** Deletes the frame. */
  def removeFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Deletes the frame. */
  def removeFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Removes the motion object created with timeline.createMotionObject(), and converts the frame(s) to static frames. */
  def removeMotionObject(startFrame: scala.Double, endFrame: scala.Double): scala.Unit = js.native
  /** Moves the first specified layer before or after the second specified layer. */
  def reorderLayer(layerToMove: scala.Double, layerToPutItBy: scala.Double): scala.Unit = js.native
  /** Moves the first specified layer before or after the second specified layer. */
  def reorderLayer(layerToMove: scala.Double, layerToPutItBy: scala.Double, bAddBefore: scala.Boolean): scala.Unit = js.native
  /** Reverses a range of frames. */
  def reverseFrames(): scala.Unit = js.native
  /** Reverses a range of frames. */
  def reverseFrames(startFrameIndex: scala.Double): scala.Unit = js.native
  /** Reverses a range of frames. */
  def reverseFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Selects all the frames in the current timeline. */
  def selectAllFrames(): scala.Unit = js.native
  /** Sets the property of the Frame object for the selected frames. */
  def setFrameProperty(property: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Sets the property of the Frame object for the selected frames. */
  def setFrameProperty(property: java.lang.String, value: js.Any, startFrameIndex: scala.Double): scala.Unit = js.native
  /** Sets the property of the Frame object for the selected frames. */
  def setFrameProperty(
    property: java.lang.String,
    value: js.Any,
    startFrameIndex: scala.Double,
    endFrameIndex: scala.Double
  ): scala.Unit = js.native
  /** Replaces the guide lines for the timeline with the information specified. */
  def setGuidelines(xmlString: java.lang.String): scala.Boolean = js.native
  /** Sets the specified property on all the selected layers to a specified value. */
  def setLayerProperty(property: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Sets the specified property on all the selected layers to a specified value. */
  def setLayerProperty(property: java.lang.String, value: js.Any, layersToChange: java.lang.String): scala.Unit = js.native
  def setSelectedFrames(selectionList: js.Array[scala.Double]): scala.Unit = js.native
  def setSelectedFrames(selectionList: js.Array[scala.Double], bReplaceCurrentSelection: scala.Boolean): scala.Unit = js.native
  /** Selects a range of frames in the current layer or sets the selected frames to the selection array passed into this method. */
  def setSelectedFrames(startFrameIndex: scala.Double, endFrameIndex: scala.Double): scala.Unit = js.native
  /** Selects a range of frames in the current layer or sets the selected frames to the selection array passed into this method. */
  def setSelectedFrames(
    startFrameIndex: scala.Double,
    endFrameIndex: scala.Double,
    bReplaceCurrentSelection: scala.Boolean
  ): scala.Unit = js.native
  /** Sets the layer to be selected; also makes the specified layer the current layer. */
  def setSelectedLayers(index: scala.Double): scala.Unit = js.native
  /** Sets the layer to be selected; also makes the specified layer the current layer. */
  def setSelectedLayers(index: scala.Double, bReplaceCurrentSelection: scala.Boolean): scala.Unit = js.native
  /** Shows the layer masking during authoring by locking the mask and masked layers. */
  def showLayerMasking(layer: scala.Double): scala.Unit = js.native
  /** Starts automatic playback of the timeline if it is not currently playing. */
  def startPlayback(): scala.Unit = js.native
  /** Stops autoumatic playback of the timeline if it is currently playing. */
  def stopPlayback(): scala.Unit = js.native
}

