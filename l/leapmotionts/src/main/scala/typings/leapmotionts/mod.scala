package typings.leapmotionts

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leapmotionts", "CircleGesture")
  @js.native
  class CircleGesture () extends Gesture {
    
    var center: Vector3 = js.native
    
    var normal: Vector3 = js.native
    
    var pointable: Pointable = js.native
    
    var progress: Double = js.native
    
    var radius: Double = js.native
  }
  /* static members */
  object CircleGesture {
    
    @JSImport("leapmotionts", "CircleGesture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "CircleGesture.classType")
    @js.native
    def classType: Double = js.native
    @scala.inline
    def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "Controller")
  @js.native
  class Controller () extends EventDispatcher {
    def this(host: String) = this()
    
    var _isConnected: Boolean = js.native
    
    var _isGesturesEnabled: Boolean = js.native
    
    var connection: WebSocket = js.native
    
    def enableGesture(`type`: Double): Unit = js.native
    def enableGesture(`type`: Double, enable: Boolean): Unit = js.native
    
    def frame(): Frame = js.native
    def frame(history: Double): Frame = js.native
    
    var frameHistory: js.Array[Frame] = js.native
    
    def isConnected(): Boolean = js.native
    
    def isGestureEnabled(`type`: Double): Boolean = js.native
    
    var latestFrame: js.Any = js.native
    
    var listener: js.Any = js.native
    
    def setListener(listener: Listener): Unit = js.native
  }
  /* static members */
  object Controller {
    
    @JSImport("leapmotionts", "Controller.getHandByID")
    @js.native
    def getHandByID(frame: js.Any, id: js.Any): js.Any = js.native
    
    @JSImport("leapmotionts", "Controller.getPointableByID")
    @js.native
    def getPointableByID(frame: js.Any, id: js.Any): js.Any = js.native
  }
  
  @JSImport("leapmotionts", "DefaultListener")
  @js.native
  class DefaultListener ()
    extends EventDispatcher
       with Listener
  
  @JSImport("leapmotionts", "EventDispatcher")
  @js.native
  class EventDispatcher () extends StObject {
    
    var _listeners: js.Any = js.native
    
    def addEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
    
    def dispatchEvent(evt: LeapEvent): Unit = js.native
    
    def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
    
    def removeEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
  }
  
  @JSImport("leapmotionts", "Finger")
  @js.native
  class Finger () extends Pointable
  /* static members */
  object Finger {
    
    @JSImport("leapmotionts", "Finger.invalid")
    @js.native
    def invalid(): Finger = js.native
  }
  
  @JSImport("leapmotionts", "Frame")
  @js.native
  class Frame () extends StObject {
    
    var _gestures: js.Array[Gesture] = js.native
    
    var controller: Controller = js.native
    
    def finger(id: Double): Finger = js.native
    
    var fingers: js.Array[Finger] = js.native
    
    def gesture(id: Double): Gesture = js.native
    
    def gestures(): js.Array[Gesture] = js.native
    def gestures(sinceFrame: Frame): js.Array[Gesture] = js.native
    
    def hand(id: Double): Hand = js.native
    
    var hands: js.Array[Hand] = js.native
    
    var id: Double = js.native
    
    def isEqualTo(other: Frame): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def pointable(id: Double): Pointable = js.native
    
    var pointables: js.Array[Pointable] = js.native
    
    var rotation: Matrix = js.native
    
    def rotationAngle(sinceFrame: Frame): Double = js.native
    def rotationAngle(sinceFrame: Frame, axis: Vector3): Double = js.native
    
    def rotationAxis(sinceFrame: Frame): Vector3 = js.native
    
    def rotationMatrix(sinceFrame: Frame): Matrix = js.native
    
    def scaleFactor(sinceFrame: Frame): Double = js.native
    
    var scaleFactorNumber: Double = js.native
    
    var timestamp: Double = js.native
    
    def tool(id: Double): Tool = js.native
    
    var tools: js.Array[Tool] = js.native
    
    def translation(sinceFrame: Frame): Vector3 = js.native
    
    var translationVector: Vector3 = js.native
  }
  /* static members */
  object Frame {
    
    @JSImport("leapmotionts", "Frame.invalid")
    @js.native
    def invalid(): Frame = js.native
  }
  
  @JSImport("leapmotionts", "Gesture")
  @js.native
  class Gesture () extends StObject {
    
    var duration: Double = js.native
    
    var durationSeconds: Double = js.native
    
    var frame: Frame = js.native
    
    var hands: js.Array[Hand] = js.native
    
    var id: Double = js.native
    
    def isEqualTo(other: Gesture): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    var pointables: js.Array[Pointable] = js.native
    
    var state: Double = js.native
    
    var `type`: Double = js.native
  }
  /* static members */
  object Gesture {
    
    @JSImport("leapmotionts", "Gesture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "Gesture.STATE_INVALID")
    @js.native
    def STATE_INVALID: Double = js.native
    @scala.inline
    def STATE_INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_START")
    @js.native
    def STATE_START: Double = js.native
    @scala.inline
    def STATE_START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_START")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_STOP")
    @js.native
    def STATE_STOP: Double = js.native
    @scala.inline
    def STATE_STOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_STOP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_UPDATE")
    @js.native
    def STATE_UPDATE: Double = js.native
    @scala.inline
    def STATE_UPDATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_CIRCLE")
    @js.native
    def TYPE_CIRCLE: Double = js.native
    @scala.inline
    def TYPE_CIRCLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_CIRCLE")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_INVALID")
    @js.native
    def TYPE_INVALID: Double = js.native
    @scala.inline
    def TYPE_INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_KEY_TAP")
    @js.native
    def TYPE_KEY_TAP: Double = js.native
    @scala.inline
    def TYPE_KEY_TAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_KEY_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_SCREEN_TAP")
    @js.native
    def TYPE_SCREEN_TAP: Double = js.native
    @scala.inline
    def TYPE_SCREEN_TAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_SCREEN_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_SWIPE")
    @js.native
    def TYPE_SWIPE: Double = js.native
    @scala.inline
    def TYPE_SWIPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_SWIPE")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.invalid")
    @js.native
    def invalid(): Gesture = js.native
  }
  
  @JSImport("leapmotionts", "Hand")
  @js.native
  class Hand () extends StObject {
    
    var direction: Vector3 = js.native
    
    def finger(id: Double): Finger = js.native
    
    var fingers: js.Array[Finger] = js.native
    
    var frame: Frame = js.native
    
    var id: Double = js.native
    
    def isEqualTo(other: Hand): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    var palmNormal: Vector3 = js.native
    
    var palmPosition: Vector3 = js.native
    
    var palmVelocity: Vector3 = js.native
    
    def pointable(id: Double): Pointable = js.native
    
    var pointables: js.Array[Pointable] = js.native
    
    var rotation: Matrix = js.native
    
    def rotationAngle(sinceFrame: Frame): Double = js.native
    def rotationAngle(sinceFrame: Frame, axis: Vector3): Double = js.native
    
    def rotationAxis(sinceFrame: Frame): Vector3 = js.native
    
    def rotationMatrix(sinceFrame: Frame): Matrix = js.native
    
    def scaleFactor(sinceFrame: Frame): Double = js.native
    
    var scaleFactorNumber: Double = js.native
    
    var sphereCenter: Vector3 = js.native
    
    var sphereRadius: Double = js.native
    
    def tool(id: Double): Tool = js.native
    
    var tools: js.Array[Tool] = js.native
    
    def translation(sinceFrame: Frame): Vector3 = js.native
    
    var translationVector: Vector3 = js.native
  }
  /* static members */
  object Hand {
    
    @JSImport("leapmotionts", "Hand.invalid")
    @js.native
    def invalid(): Hand = js.native
  }
  
  @JSImport("leapmotionts", "KeyTapGesture")
  @js.native
  class KeyTapGesture () extends Gesture {
    
    var direction: Vector3 = js.native
    
    var pointable: Pointable = js.native
    
    var position: Vector3 = js.native
    
    var progress: Double = js.native
  }
  /* static members */
  object KeyTapGesture {
    
    @JSImport("leapmotionts", "KeyTapGesture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "KeyTapGesture.classType")
    @js.native
    def classType: Double = js.native
    @scala.inline
    def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "LeapEvent")
  @js.native
  class LeapEvent protected () extends StObject {
    def this(`type`: String, targetListener: Listener) = this()
    def this(`type`: String, targetListener: Listener, frame: Frame) = this()
    
    var _target: js.Any = js.native
    
    var _type: js.Any = js.native
    
    var frame: Frame = js.native
    
    def getTarget(): js.Any = js.native
    
    def getType(): String = js.native
  }
  /* static members */
  object LeapEvent {
    
    @JSImport("leapmotionts", "LeapEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_CONNECTED")
    @js.native
    def LEAPMOTION_CONNECTED: String = js.native
    @scala.inline
    def LEAPMOTION_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_DISCONNECTED")
    @js.native
    def LEAPMOTION_DISCONNECTED: String = js.native
    @scala.inline
    def LEAPMOTION_DISCONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_DISCONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_EXIT")
    @js.native
    def LEAPMOTION_EXIT: String = js.native
    @scala.inline
    def LEAPMOTION_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_FRAME")
    @js.native
    def LEAPMOTION_FRAME: String = js.native
    @scala.inline
    def LEAPMOTION_FRAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_FRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_INIT")
    @js.native
    def LEAPMOTION_INIT: String = js.native
    @scala.inline
    def LEAPMOTION_INIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_INIT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "LeapUtil")
  @js.native
  class LeapUtil () extends StObject
  /* static members */
  object LeapUtil {
    
    @JSImport("leapmotionts", "LeapUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "LeapUtil.DEG_TO_RAD")
    @js.native
    def DEG_TO_RAD: Double = js.native
    @scala.inline
    def DEG_TO_RAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.HALF_PI")
    @js.native
    def HALF_PI: Double = js.native
    @scala.inline
    def HALF_PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_PI")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.PI")
    @js.native
    def PI: Double = js.native
    @scala.inline
    def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.RAD_TO_DEG")
    @js.native
    def RAD_TO_DEG: Double = js.native
    @scala.inline
    def RAD_TO_DEG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAD_TO_DEG")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.TWO_PI")
    @js.native
    def TWO_PI: Double = js.native
    @scala.inline
    def TWO_PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_PI")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.cartesianToSpherical")
    @js.native
    def cartesianToSpherical(vCartesian: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.clamp")
    @js.native
    def clamp(inVal: Double, minVal: Double, maxVal: Double): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.componentWiseMax")
    @js.native
    def componentWiseMax(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.componentWiseMin")
    @js.native
    def componentWiseMin(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.componentWiseReciprocal")
    @js.native
    def componentWiseReciprocal(inVector: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.componentWiseScale")
    @js.native
    def componentWiseScale(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.elevation")
    @js.native
    def elevation(inVector: Vector3): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.extractRotation")
    @js.native
    def extractRotation(mtxTransform: Matrix): Matrix = js.native
    
    @JSImport("leapmotionts", "LeapUtil.heading")
    @js.native
    def heading(inVector: Vector3): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.isNearZero")
    @js.native
    def isNearZero(value: Double): Boolean = js.native
    
    @JSImport("leapmotionts", "LeapUtil.lerp")
    @js.native
    def lerp(a: Double, b: Double, coefficient: Double): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.lerpVector")
    @js.native
    def lerpVector(vec1: Vector3, vec2: Vector3, coefficient: Double): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.maxComponent")
    @js.native
    def maxComponent(inVector: Vector3): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.minComponent")
    @js.native
    def minComponent(inVector: Vector3): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.normalizeSpherical")
    @js.native
    def normalizeSpherical(vSpherical: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.rigidInverse")
    @js.native
    def rigidInverse(mtxTransform: Matrix): Matrix = js.native
    
    @JSImport("leapmotionts", "LeapUtil.rotationInverse")
    @js.native
    def rotationInverse(mtxRot: Matrix): Matrix = js.native
    
    @JSImport("leapmotionts", "LeapUtil.sphericalToCartesian")
    @js.native
    def sphericalToCartesian(vSpherical: Vector3): Vector3 = js.native
    
    @JSImport("leapmotionts", "LeapUtil.toDegrees")
    @js.native
    def toDegrees(radians: Double): Double = js.native
    
    @JSImport("leapmotionts", "LeapUtil.vectorIsNearZero")
    @js.native
    def vectorIsNearZero(inVector: Vector3): Boolean = js.native
  }
  
  @JSImport("leapmotionts", "Matrix")
  @js.native
  class Matrix protected () extends StObject {
    def this(x: Vector3, y: Vector3, z: Vector3) = this()
    def this(x: Vector3, y: Vector3, z: Vector3, _origin: Vector3) = this()
    
    def isEqualTo(other: Matrix): Boolean = js.native
    
    def multiply(other: Matrix): Matrix = js.native
    
    def multiplyAssign(other: Matrix): Matrix = js.native
    
    var origin: Vector3 = js.native
    
    def rigidInverse(): Matrix = js.native
    
    def setRotation(_axis: Vector3, angleRadians: Double): Unit = js.native
    
    def transformDirection(inVector: Vector3): Vector3 = js.native
    
    def transformPoint(inVector: Vector3): Vector3 = js.native
    
    var xBasis: Vector3 = js.native
    
    var yBasis: Vector3 = js.native
    
    var zBasis: Vector3 = js.native
  }
  /* static members */
  object Matrix {
    
    @JSImport("leapmotionts", "Matrix.identity")
    @js.native
    def identity(): Matrix = js.native
  }
  
  @JSImport("leapmotionts", "Pointable")
  @js.native
  class Pointable () extends StObject {
    
    var direction: Vector3 = js.native
    
    var frame: Frame = js.native
    
    var hand: Hand = js.native
    
    var id: Double = js.native
    
    def isEqualTo(other: Pointable): Boolean = js.native
    
    var isFinger: Boolean = js.native
    
    var isTool: Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    var length: Double = js.native
    
    var tipPosition: Vector3 = js.native
    
    var tipVelocity: Vector3 = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object Pointable {
    
    @JSImport("leapmotionts", "Pointable.invalid")
    @js.native
    def invalid(): Pointable = js.native
  }
  
  @JSImport("leapmotionts", "ScreenTapGesture")
  @js.native
  class ScreenTapGesture () extends Gesture {
    
    var direction: Vector3 = js.native
    
    var pointable: Pointable = js.native
    
    var position: Vector3 = js.native
    
    var progress: Double = js.native
  }
  /* static members */
  object ScreenTapGesture {
    
    @JSImport("leapmotionts", "ScreenTapGesture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "ScreenTapGesture.classType")
    @js.native
    def classType: Double = js.native
    @scala.inline
    def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "SwipeGesture")
  @js.native
  class SwipeGesture () extends Gesture {
    
    var direction: Vector3 = js.native
    
    var pointable: Pointable = js.native
    
    var position: Vector3 = js.native
    
    var speed: Double = js.native
    
    var startPosition: Vector3 = js.native
  }
  /* static members */
  object SwipeGesture {
    
    @JSImport("leapmotionts", "SwipeGesture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "SwipeGesture.classType")
    @js.native
    def classType: Double = js.native
    @scala.inline
    def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "Tool")
  @js.native
  class Tool () extends Pointable
  /* static members */
  object Tool {
    
    @JSImport("leapmotionts", "Tool.invalid")
    @js.native
    def invalid(): Tool = js.native
  }
  
  @JSImport("leapmotionts", "Vector3")
  @js.native
  class Vector3 protected () extends StObject {
    def this(x: Double, y: Double, z: Double) = this()
    
    def angleTo(other: Vector3): Double = js.native
    
    def cross(other: Vector3): Vector3 = js.native
    
    def distanceTo(other: Vector3): Double = js.native
    
    def divide(scalar: Double): Vector3 = js.native
    
    def divideAssign(scalar: Double): Vector3 = js.native
    
    def dot(other: Vector3): Double = js.native
    
    def isEqualTo(other: Vector3): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def magnitude(): Double = js.native
    
    def magnitudeSquared(): Double = js.native
    
    def minus(other: Vector3): Vector3 = js.native
    
    def minusAssign(other: Vector3): Vector3 = js.native
    
    def multiply(scalar: Double): Vector3 = js.native
    
    def multiplyAssign(scalar: Double): Vector3 = js.native
    
    def normalized(): Vector3 = js.native
    
    def opposite(): Vector3 = js.native
    
    var pitch: Double = js.native
    
    def plus(other: Vector3): Vector3 = js.native
    
    def plusAssign(other: Vector3): Vector3 = js.native
    
    var roll: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var yaw: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector3 {
    
    @JSImport("leapmotionts", "Vector3.backward")
    @js.native
    def backward(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.down")
    @js.native
    def down(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.forward")
    @js.native
    def forward(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.invalid")
    @js.native
    def invalid(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.left")
    @js.native
    def left(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.right")
    @js.native
    def right(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.up")
    @js.native
    def up(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.xAxis")
    @js.native
    def xAxis(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.yAxis")
    @js.native
    def yAxis(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.zAxis")
    @js.native
    def zAxis(): Vector3 = js.native
    
    @JSImport("leapmotionts", "Vector3.zero")
    @js.native
    def zero(): Vector3 = js.native
  }
  
  @js.native
  trait Listener extends StObject {
    
    def onConnect(controller: Controller): Unit = js.native
    
    def onDisconnect(controller: Controller): Unit = js.native
    
    def onExit(controller: Controller): Unit = js.native
    
    def onFrame(controller: Controller, frame: Frame): Unit = js.native
    
    def onInit(controller: Controller): Unit = js.native
  }
  object Listener {
    
    @scala.inline
    def apply(
      onConnect: Controller => Unit,
      onDisconnect: Controller => Unit,
      onExit: Controller => Unit,
      onFrame: (Controller, Frame) => Unit,
      onInit: Controller => Unit
    ): Listener = {
      val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnConnect(value: Controller => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisconnect(value: Controller => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExit(value: Controller => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFrame(value: (Controller, Frame) => Unit): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInit(value: Controller => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
    }
  }
}
