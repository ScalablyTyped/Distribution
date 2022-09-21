package typings.leapmotionts

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leapmotionts", "CircleGesture")
  @js.native
  open class CircleGesture () extends Gesture {
    
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
    inline def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "Controller")
  @js.native
  open class Controller () extends EventDispatcher {
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
    
    /* private */ var latestFrame: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    def setListener(listener: Listener): Unit = js.native
  }
  /* static members */
  object Controller {
    
    @JSImport("leapmotionts", "Controller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHandByID(frame: Any, id: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHandByID")(frame.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPointableByID(frame: Any, id: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointableByID")(frame.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("leapmotionts", "DefaultListener")
  @js.native
  open class DefaultListener ()
    extends EventDispatcher
       with Listener {
    
    /* CompleteClass */
    override def onConnect(controller: Controller): Unit = js.native
    
    /* CompleteClass */
    override def onDisconnect(controller: Controller): Unit = js.native
    
    /* CompleteClass */
    override def onExit(controller: Controller): Unit = js.native
    
    /* CompleteClass */
    override def onFrame(controller: Controller, frame: Frame): Unit = js.native
    
    /* CompleteClass */
    override def onInit(controller: Controller): Unit = js.native
  }
  
  @JSImport("leapmotionts", "EventDispatcher")
  @js.native
  open class EventDispatcher () extends StObject {
    
    /* private */ var _listeners: Any = js.native
    
    def addEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
    
    def dispatchEvent(evt: LeapEvent): Unit = js.native
    
    def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
    
    def removeEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
  }
  
  @JSImport("leapmotionts", "Finger")
  @js.native
  open class Finger () extends Pointable
  /* static members */
  object Finger {
    
    @JSImport("leapmotionts", "Finger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def invalid(): Finger = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Finger]
  }
  
  @JSImport("leapmotionts", "Frame")
  @js.native
  open class Frame () extends StObject {
    
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
    
    @JSImport("leapmotionts", "Frame")
    @js.native
    val ^ : js.Any = js.native
    
    inline def invalid(): Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Frame]
  }
  
  @JSImport("leapmotionts", "Gesture")
  @js.native
  open class Gesture () extends StObject {
    
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
    inline def STATE_INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_START")
    @js.native
    def STATE_START: Double = js.native
    inline def STATE_START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_START")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_STOP")
    @js.native
    def STATE_STOP: Double = js.native
    inline def STATE_STOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_STOP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.STATE_UPDATE")
    @js.native
    def STATE_UPDATE: Double = js.native
    inline def STATE_UPDATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_CIRCLE")
    @js.native
    def TYPE_CIRCLE: Double = js.native
    inline def TYPE_CIRCLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_CIRCLE")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_INVALID")
    @js.native
    def TYPE_INVALID: Double = js.native
    inline def TYPE_INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_KEY_TAP")
    @js.native
    def TYPE_KEY_TAP: Double = js.native
    inline def TYPE_KEY_TAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_KEY_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_SCREEN_TAP")
    @js.native
    def TYPE_SCREEN_TAP: Double = js.native
    inline def TYPE_SCREEN_TAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_SCREEN_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "Gesture.TYPE_SWIPE")
    @js.native
    def TYPE_SWIPE: Double = js.native
    inline def TYPE_SWIPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_SWIPE")(x.asInstanceOf[js.Any])
    
    inline def invalid(): Gesture = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Gesture]
  }
  
  @JSImport("leapmotionts", "Hand")
  @js.native
  open class Hand () extends StObject {
    
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
    
    @JSImport("leapmotionts", "Hand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def invalid(): Hand = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Hand]
  }
  
  @JSImport("leapmotionts", "KeyTapGesture")
  @js.native
  open class KeyTapGesture () extends Gesture {
    
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
    inline def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "LeapEvent")
  @js.native
  open class LeapEvent protected () extends StObject {
    def this(`type`: String, targetListener: Listener) = this()
    def this(`type`: String, targetListener: Listener, frame: Frame) = this()
    
    /* private */ var _target: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    var frame: Frame = js.native
    
    def getTarget(): Any = js.native
    
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
    inline def LEAPMOTION_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_DISCONNECTED")
    @js.native
    def LEAPMOTION_DISCONNECTED: String = js.native
    inline def LEAPMOTION_DISCONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_DISCONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_EXIT")
    @js.native
    def LEAPMOTION_EXIT: String = js.native
    inline def LEAPMOTION_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_FRAME")
    @js.native
    def LEAPMOTION_FRAME: String = js.native
    inline def LEAPMOTION_FRAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_FRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapEvent.LEAPMOTION_INIT")
    @js.native
    def LEAPMOTION_INIT: String = js.native
    inline def LEAPMOTION_INIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAPMOTION_INIT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "LeapUtil")
  @js.native
  open class LeapUtil () extends StObject
  /* static members */
  object LeapUtil {
    
    @JSImport("leapmotionts", "LeapUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leapmotionts", "LeapUtil.DEG_TO_RAD")
    @js.native
    def DEG_TO_RAD: Double = js.native
    inline def DEG_TO_RAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.HALF_PI")
    @js.native
    def HALF_PI: Double = js.native
    inline def HALF_PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_PI")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.PI")
    @js.native
    def PI: Double = js.native
    inline def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.RAD_TO_DEG")
    @js.native
    def RAD_TO_DEG: Double = js.native
    inline def RAD_TO_DEG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAD_TO_DEG")(x.asInstanceOf[js.Any])
    
    @JSImport("leapmotionts", "LeapUtil.TWO_PI")
    @js.native
    def TWO_PI: Double = js.native
    inline def TWO_PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_PI")(x.asInstanceOf[js.Any])
    
    inline def cartesianToSpherical(vCartesian: Vector3): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesianToSpherical")(vCartesian.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    inline def clamp(inVal: Double, minVal: Double, maxVal: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(inVal.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def componentWiseMax(vLHS: Vector3, vRHS: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("componentWiseMax")(vLHS.asInstanceOf[js.Any], vRHS.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def componentWiseMin(vLHS: Vector3, vRHS: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("componentWiseMin")(vLHS.asInstanceOf[js.Any], vRHS.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def componentWiseReciprocal(inVector: Vector3): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWiseReciprocal")(inVector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    inline def componentWiseScale(vLHS: Vector3, vRHS: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("componentWiseScale")(vLHS.asInstanceOf[js.Any], vRHS.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def elevation(inVector: Vector3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elevation")(inVector.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def extractRotation(mtxTransform: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRotation")(mtxTransform.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    inline def heading(inVector: Vector3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("heading")(inVector.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isNearZero(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNearZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def lerp(a: Double, b: Double, coefficient: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def lerpVector(vec1: Vector3, vec2: Vector3, coefficient: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpVector")(vec1.asInstanceOf[js.Any], vec2.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def maxComponent(inVector: Vector3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxComponent")(inVector.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def minComponent(inVector: Vector3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minComponent")(inVector.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def normalizeSpherical(vSpherical: Vector3): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSpherical")(vSpherical.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    inline def rigidInverse(mtxTransform: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rigidInverse")(mtxTransform.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    inline def rotationInverse(mtxRot: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationInverse")(mtxRot.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    inline def sphericalToCartesian(vSpherical: Vector3): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("sphericalToCartesian")(vSpherical.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def vectorIsNearZero(inVector: Vector3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("vectorIsNearZero")(inVector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("leapmotionts", "Matrix")
  @js.native
  open class Matrix protected () extends StObject {
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
    
    @JSImport("leapmotionts", "Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    inline def identity(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[Matrix]
  }
  
  @JSImport("leapmotionts", "Pointable")
  @js.native
  open class Pointable () extends StObject {
    
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
    
    @JSImport("leapmotionts", "Pointable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def invalid(): Pointable = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Pointable]
  }
  
  @JSImport("leapmotionts", "ScreenTapGesture")
  @js.native
  open class ScreenTapGesture () extends Gesture {
    
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
    inline def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "SwipeGesture")
  @js.native
  open class SwipeGesture () extends Gesture {
    
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
    inline def classType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("leapmotionts", "Tool")
  @js.native
  open class Tool () extends Pointable
  /* static members */
  object Tool {
    
    @JSImport("leapmotionts", "Tool")
    @js.native
    val ^ : js.Any = js.native
    
    inline def invalid(): Tool = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Tool]
  }
  
  @JSImport("leapmotionts", "Vector3")
  @js.native
  open class Vector3 protected () extends StObject {
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
    
    @JSImport("leapmotionts", "Vector3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def backward(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("backward")().asInstanceOf[Vector3]
    
    inline def down(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[Vector3]
    
    inline def forward(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[Vector3]
    
    inline def invalid(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Vector3]
    
    inline def left(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("left")().asInstanceOf[Vector3]
    
    inline def right(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("right")().asInstanceOf[Vector3]
    
    inline def up(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[Vector3]
    
    inline def xAxis(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("xAxis")().asInstanceOf[Vector3]
    
    inline def yAxis(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("yAxis")().asInstanceOf[Vector3]
    
    inline def zAxis(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zAxis")().asInstanceOf[Vector3]
    
    inline def zero(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Vector3]
  }
  
  trait Listener extends StObject {
    
    def onConnect(controller: Controller): Unit
    
    def onDisconnect(controller: Controller): Unit
    
    def onExit(controller: Controller): Unit
    
    def onFrame(controller: Controller, frame: Frame): Unit
    
    def onInit(controller: Controller): Unit
  }
  object Listener {
    
    inline def apply(
      onConnect: Controller => Unit,
      onDisconnect: Controller => Unit,
      onExit: Controller => Unit,
      onFrame: (Controller, Frame) => Unit,
      onInit: Controller => Unit
    ): Listener = {
      val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
      __obj.asInstanceOf[Listener]
    }
    
    extension [Self <: Listener](x: Self) {
      
      inline def setOnConnect(value: Controller => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnDisconnect(value: Controller => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnExit(value: Controller => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      inline def setOnFrame(value: (Controller, Frame) => Unit): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      inline def setOnInit(value: Controller => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
    }
  }
}
