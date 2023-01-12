package typings.juiCore

import typings.jquery.JQuery
import typings.juiCore.anon.Mozilla
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jui-core", "ColorScale")
  @js.native
  open class ColorScale () extends StObject {
    
    def domain(color: String, color2: String): this.type = js.native
    
    def ticks(max: Double): this.type = js.native
  }
  
  @JSImport("jui-core", "jui")
  @js.native
  val jui: JuiStatic = js.native
  
  @js.native
  trait JuiStatic extends StObject {
    
    /**
      * Adds a component object created
      *
      * @param ui UI instance
      */
    def add(uiIns: Any): Unit = js.native
    
    /**
      * It is possible to create a component dynamically after the ready point
      *
      * @param type UI type
      */
    def create(`type`: String, selector: Any): Any = js.native
    def create(`type`: String, selector: Any, options: js.Object): Any = js.native
    
    /**
      * UI 클래스에서 사용될 클래스를 정의하고, 자유롭게 상속할 수 있는 클래스를 정의
      *
      * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
      * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
      * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
      * @param parent 상속받을 클래스
      */
    def define(name: String, depends: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    def define(name: String, depends: js.Array[String], callback: js.Function0[Unit], parent: String): Unit = js.native
    
    /**
      * 사용자가 실제로 사용할 수 있는 UI 클래스를 정의
      *
      * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
      * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
      * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
      */
    def defineUI(name: String, depends: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    def defineUI(name: String, depends: js.Array[String], callback: js.Function0[Unit], parent: String): Unit = js.native
    
    /**
      * Generates a custom event to an applicable component
      *
      * @param key Selector or UI type
      * @param type Event type
      * @param args Event arguments
      */
    def emit(key: String, `type`: String, args: js.Array[Any]): Unit = js.native
    
    def get(key: String): Any = js.native
    /**
      * Gets a component currently created
      *
      * @returns UI instance
      */
    def get(key: Double): Any = js.native
    
    /**
      * Gets all components currently created
      *
      * @return UI instances
      */
    def getAll(): js.Array[Any] = js.native
    
    /**
      * define과 defineUI로 정의된 클래스 또는 객체를 가져온다.
      *
      * @param name 가져온 클래스 또는 객체의 이름
      */
    def include(name: String): Any = js.native
    
    /**
      * define과 defineUI로 정의된 모든 클래스와 객체를 가져온다.
      */
    def includeAll(): js.Array[Any] = js.native
    
    /**
      * ready 타임에 실행될 callback 정의
      */
    def ready(): Unit = js.native
    def ready(depends: js.Array[String]): Unit = js.native
    def ready(depends: js.Array[String], callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def ready(depends: Unit, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * UI 클래스에서 사용될 클래스를 정의하고, 자유롭게 상속할 수 있는 클래스를 정의
      *
      * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
      * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
      * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
      * @param parent 상속받을 클래스
      */
    def redefine(name: String, depends: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    def redefine(name: String, depends: js.Array[String], callback: js.Function0[Unit], parent: String): Unit = js.native
  }
  
  trait UICollection extends StObject {
    
    def destroy(): Unit
  }
  object UICollection {
    
    inline def apply(destroy: () => Unit): UICollection = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[UICollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UICollection] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait UICore extends StObject {
    
    /**
      * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
      *
      * @param name Method name
      * @param params Parameters
      */
    def addValid(name: String, params: js.Array[Any]): Unit
    
    /**
      * Sets a callback function that is called after a UI method is run
      *
      * @param name Method name
      */
    def callAfter(name: String, callback: js.Function0[Unit]): Unit
    
    /**
      * Sets a callback function that is called before a UI method is run
      *
      * @param name Method name
      */
    def callBefore(name: String, callback: js.Function0[Unit]): Unit
    
    /**
      * Sets a callback function and the delay time before/after a UI method is run
      *
      * @param name Method name
      */
    def callDelay(name: String, callObj: js.Function0[Unit]): Unit
    
    def destroy(): Unit
    
    /**
      * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
      *
      * @param type Event type
      * @param args Event Arguments
      */
    def emit(`type`: String, args: js.Function0[Unit]): Any
    
    var event: js.UndefOr[Any] = js.undefined
    
    /**
      * Removes a custom event of an applicable type or callback handler
      *
      * @param type Event type
      */
    def off(`type`: String): Unit
    
    /**
      * A callback function defined as an on method is run when an emit method is called
      *
      * @param type Event type
      */
    def on(`type`: String, callback: js.Function0[Unit]): Unit
    
    var root: js.UndefOr[Any] = js.undefined
    
    /**
      * Dynamically defines the options of a UI
      */
    def setOption(key: String, value: Any): Unit
    
    /**
      * Dynamically defines the template method of a UI
      *
      * @param name Template name
      * @param html Template markup
      */
    def setTpl(name: String, html: String): Unit
    
    var tpl: js.UndefOr[Any] = js.undefined
  }
  object UICore {
    
    inline def apply(
      addValid: (String, js.Array[Any]) => Unit,
      callAfter: (String, js.Function0[Unit]) => Unit,
      callBefore: (String, js.Function0[Unit]) => Unit,
      callDelay: (String, js.Function0[Unit]) => Unit,
      destroy: () => Unit,
      emit: (String, js.Function0[Unit]) => Any,
      off: String => Unit,
      on: (String, js.Function0[Unit]) => Unit,
      setOption: (String, Any) => Unit,
      setTpl: (String, String) => Unit
    ): UICore = {
      val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
      __obj.asInstanceOf[UICore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UICore] (val x: Self) extends AnyVal {
      
      inline def setAddValid(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "addValid", js.Any.fromFunction2(value))
      
      inline def setCallAfter(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "callAfter", js.Any.fromFunction2(value))
      
      inline def setCallBefore(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "callBefore", js.Any.fromFunction2(value))
      
      inline def setCallDelay(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "callDelay", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setEmit(value: (String, js.Function0[Unit]) => Any): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setOff(value: String => Unit): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSetOption(value: (String, Any) => Unit): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
      
      inline def setSetTpl(value: (String, String) => Unit): Self = StObject.set(x, "setTpl", js.Any.fromFunction2(value))
      
      inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    }
  }
  
  trait UIEvent
    extends StObject
       with UICore {
    
    /**
      * Get the child element of the root element
      */
    def find(selector: Any): JQuery[HTMLElement]
  }
  object UIEvent {
    
    inline def apply(
      addValid: (String, js.Array[Any]) => Unit,
      callAfter: (String, js.Function0[Unit]) => Unit,
      callBefore: (String, js.Function0[Unit]) => Unit,
      callDelay: (String, js.Function0[Unit]) => Unit,
      destroy: () => Unit,
      emit: (String, js.Function0[Unit]) => Any,
      find: Any => JQuery[HTMLElement],
      off: String => Unit,
      on: (String, js.Function0[Unit]) => Unit,
      setOption: (String, Any) => Unit,
      setTpl: (String, String) => Unit
    ): UIEvent = {
      val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), find = js.Any.fromFunction1(find), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
      __obj.asInstanceOf[UIEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UIEvent] (val x: Self) extends AnyVal {
      
      inline def setFind(value: Any => JQuery[HTMLElement]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UtilBase extends StObject {
    
    def ajax(data: Any): Unit = js.native
    
    /**
      * Base64 디코딩
      */
    def atob(input: String): Any = js.native
    
    /** check browser agent */
    var browser: Mozilla = js.native
    
    /**
      * Base64 인코딩
      */
    def btoa(input: Any): String = js.native
    
    /**
      * split array by length
      */
    def chunk(arr: js.Array[Any], len: Double): js.Array[Any] = js.native
    
    /**
      * implements object clone
      * @param obj 복사할 객체
      */
    def clone(obj: Any): js.Array[Any] = js.native
    
    /**
      *
      * 유니크 아이디 생성
      *
      * @param key  prefix string
      * @return 생성된 아이디 문자열
      */
    def createId(key: String): String = js.native
    
    /**
      * csv 다운로드 링크로 변환
      *
      * @return data uri string
      */
    def csvToBase64(csv: String): String = js.native
    
    def csvToData(keys: js.Array[String], csv: String, csvNumber: Double): js.Array[Any] = js.native
    
    /**
      * data 를 csv 로 변환한다.
      *
      * @return  변환된 csv 문자열
      */
    def dataToCsv(keys: js.Array[String], dataList: js.Array[Any], dataSize: Double): String = js.native
    
    def dataToCsv2(options: Any): String = js.native
    
    /**
      *
      * implements date format function
      *
      * yyyy : 4 digits year
      * yy : 2 digits year
      * y : 1 digit year
      *
      * @param format   date format string
      */
    def dateFormat(date: js.Date, format: String): String = js.native
    def dateFormat(date: js.Date, format: String, utc: Boolean): String = js.native
    
    /**
      * implements object deep clone
      */
    def deepClone(obj: Any, emit: Any): js.Array[Any] = js.native
    
    /**
      * Check that it matches the end of a string search string.
      *
      * @return position
      */
    def endsWith(str: String, searchString: String): Double = js.native
    def endsWith(str: String, searchString: String, position: Double): Double = js.native
    
    /**
      * implements object extend
      */
    def extend(origin: Any, add: Any, skip: Boolean): Any = js.native
    
    /**
      * file 에서 csv 컨텐츠 로드
      */
    def fileToCsv(fileText: String, callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
    
    /**
      *
      * csv 에서 필드 얻어오기
      *
      */
    def getCsvFields(fields: js.Array[String], csvFields: js.Array[String]): js.Array[String] = js.native
    
    def inArray(target: Any, list: js.Array[Any]): Double = js.native
    
    /**
      * IndexParser 객체 생성
      */
    def index(): UtilKeyParser = js.native
    
    /**
      * 프로토타입 기반의 상속 제공
      *
      * @param ctor base Class
      * @param superCtor super Class
      */
    def inherit(ctor: js.Function1[/* repeated */ Any, Any], superCtor: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    var isTouch: Boolean = js.native
    
    /**
      * 최적화된 루프 생성 (5단계로 나눔)
      *
      * @param total   loop count
      * @return 최적화된 루프 콜백 (index, groupIndex 2가지 파라미터를 받는다.)
      */
    def loop(total: Double): js.Function2[/* index */ Double, /* groupIndex */ Double, Unit] = js.native
    def loop(total: Double, context: Any): js.Function2[/* index */ Double, /* groupIndex */ Double, Unit] = js.native
    
    /**
      * 배열을 사용해서 최적화된 루프로 생성한다.
      *
      *
      * @param data 루프로 생성될 배열
      * @return 최적화된 루프 콜백 (data, index, groupIndex 3가지 파라미터를 받는다.)
      */
    def loopArray(data: js.Array[Any]): js.Function3[/* data */ Any, /* index */ Double, /* groupIndex */ Double, Unit] = js.native
    def loopArray(data: js.Array[Any], context: Any): js.Function3[/* data */ Any, /* index */ Double, /* groupIndex */ Double, Unit] = js.native
    
    /**
      * 배열의 키 기반 인덱스를 생성한다.
      *
      * 개별 값 별로 멀티 인덱스를 생성한다.
      *
      * @return 생성된 인덱스
      */
    def makeIndex(data: js.Array[Any], keyField: String): Any = js.native
    
    def param(data: Any): String = js.native
    
    /**
      * convert px to integer
      */
    def pxToInt(px: String): Double = js.native
    def pxToInt(px: Double): Double = js.native
    
    def ready(args: Any*): Unit = js.native
    
    /**
      * add event in window resize event
      * @param ms delay time
      */
    def resize(callback: js.Function1[/* repeated */ Any, Unit], ms: Double): Unit = js.native
    
    /**
      * caculate callback runtime
      */
    def runtime(name: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def scrollWidth(): Double = js.native
    
    /**
      * use QuickSort
      */
    def sort(array: js.Array[Any]): js.Function2[/* array */ js.Array[Double], /* isClone */ Boolean, this.type] = js.native
    
    /**
      * Check that it matches the starting string search string.
      *
      * @return position
      */
    def startsWith(str: String, searchString: String): Double = js.native
    def startsWith(str: String, searchString: String, position: Double): Double = js.native
    
    /**
      *
      * xml 문자열로 svg datauri 생성
      *
      * @return 변환된 data uri 링크
      */
    def svgToBase64(xml: String): String = js.native
    
    /**
      * parsing template string
      */
    def template(html: String): (js.Function1[/* obj */ Any, String]) | String = js.native
    def template(html: String, obj: Any): (js.Function1[/* obj */ Any, String]) | String = js.native
    
    /**
      * implement async loop without blocking ui
      *
      * @param total   loop count
      */
    def timeLoop(total: Double): js.Function1[/* index */ Double, Unit] = js.native
    def timeLoop(total: Double, context: Any): js.Function1[/* index */ Double, Unit] = js.native
    
    def trim(text: String): String = js.native
    
    /**
      * check data  type
      * @param t  type string
      * @param v value object
      */
    def typeCheck(typeName: String, value: Any): Boolean = js.native
    
    def typeCheckObj(uiObj: Any, list: Any): Unit = js.native
  }
  
  trait UtilBase64 extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
  }
  object UtilBase64 {
    
    inline def apply(decode: String => String, encode: String => String): UtilBase64 = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[UtilBase64]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UtilBase64] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait UtilColor extends StObject {
    
    /**
      * convert hsv to rgb
      *
      *         color.HSVtoRGB(0,0,1) === #FFFFF === { r : 255, g : 0, b : 0 }
      *
      * @param H  hue color number  (min : 0, max : 360)
      * @param S  Saturation number  (min : 0, max : 1)
      * @param V  Value number         (min : 0, max : 1 )
      */
    def HSVtoRGB(H: Double, S: Double, V: Double): Any
    
    /**
      * convert rgb to hsv
      *
      *         color.RGBtoHSV(0, 0, 255) === { h : 240, s : 1, v : 1 } === '#FFFF00'
      *
      * @param R  red color value
      * @param G  green color value
      * @param B  blue color value
      * @return  hsv color code
      */
    def RGBtoHSV(R: Double, G: Double, B: Double): Any
    
    /**
      * rgb 컬러 어두운 농도로 변환
      *
      * @param color   RGB color code
      * @param rate 어두운 농도
      */
    def darken(color: String, rate: Double): String
    
    /**
      * convert color to format string
      *
      *     // hex
      *     color.format({ r : 255, g : 255, b : 255 }, 'hex')  // #FFFFFF
      *
      *     // rgb
      *     color.format({ r : 255, g : 255, b : 255 }, 'rgb') // rgba(255, 255, 255, 0.5);
      *
      *     // rgba
      *     color.format({ r : 255, g : 255, b : 255, a : 0.5 }, 'rgb') // rgba(255, 255, 255, 0.5);
      *
      * @param obj  obj has r, g, b and a attributes
      * @param type  format string type
      */
    def format(obj: Any, `type`: String): String
    
    /**
      * rgb 컬러 밝은 농도로 변환
      *
      * @param color   RGB color code
      * @param rate 밝은 농도
      */
    def lighten(color: String, rate: Double): String
    
    /**
      * create color map
      *
      *         var colorList = color.map(['#352a87', '#0f5cdd', '#00b5a6', '#ffc337', '#fdff00'], count)
      *
      * @param count  a divide number
      * @returns converted color list
      */
    def map(color_list: js.Array[String], count: Double): js.Array[String]
    
    /**
      * parse string to rgb color
      *
      *         color.rgb("#FF0000") === { r : 255, g : 0, b : 0 }
      *
      *         color.rgb("rgb(255, 0, 0)") == { r : 255, g : 0, b : }
      *
      * @param str color string
      * @returns  rgb object
      */
    def rgb(str: String): Any
    
    /**
      * get color scale
      *
      *         var c = color.scale().domain('#FF0000', '#00FF00');
      *
      *         // get middle color
      *         c(0.5)   ==  #808000
      *
      *         // get middle color list
      *         c.ticks(20);  // return array ,    [startColor, ......, endColor ]
      *
      * @returns scale function
      */
    def scale(): ColorScale
  }
  object UtilColor {
    
    inline def apply(
      HSVtoRGB: (Double, Double, Double) => Any,
      RGBtoHSV: (Double, Double, Double) => Any,
      darken: (String, Double) => String,
      format: (Any, String) => String,
      lighten: (String, Double) => String,
      map: (js.Array[String], Double) => js.Array[String],
      rgb: String => Any,
      scale: () => ColorScale
    ): UtilColor = {
      val __obj = js.Dynamic.literal(HSVtoRGB = js.Any.fromFunction3(HSVtoRGB), RGBtoHSV = js.Any.fromFunction3(RGBtoHSV), darken = js.Any.fromFunction2(darken), format = js.Any.fromFunction2(format), lighten = js.Any.fromFunction2(lighten), map = js.Any.fromFunction2(map), rgb = js.Any.fromFunction1(rgb), scale = js.Any.fromFunction0(scale))
      __obj.asInstanceOf[UtilColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UtilColor] (val x: Self) extends AnyVal {
      
      inline def setDarken(value: (String, Double) => String): Self = StObject.set(x, "darken", js.Any.fromFunction2(value))
      
      inline def setFormat(value: (Any, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setHSVtoRGB(value: (Double, Double, Double) => Any): Self = StObject.set(x, "HSVtoRGB", js.Any.fromFunction3(value))
      
      inline def setLighten(value: (String, Double) => String): Self = StObject.set(x, "lighten", js.Any.fromFunction2(value))
      
      inline def setMap(value: (js.Array[String], Double) => js.Array[String]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setRGBtoHSV(value: (Double, Double, Double) => Any): Self = StObject.set(x, "RGBtoHSV", js.Any.fromFunction3(value))
      
      inline def setRgb(value: String => Any): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
      
      inline def setScale(value: () => ColorScale): Self = StObject.set(x, "scale", js.Any.fromFunction0(value))
    }
  }
  
  trait UtilKeyParser extends StObject {
    
    def changeIndex(index: String, targetIndex: String, rootIndex: String): String
    
    def getIndexList(index: String): Boolean
    
    def getNextIndex(index: String): String
    
    def getParentIndex(index: String): String
    
    def isIndexDepth(index: String): Boolean
  }
  object UtilKeyParser {
    
    inline def apply(
      changeIndex: (String, String, String) => String,
      getIndexList: String => Boolean,
      getNextIndex: String => String,
      getParentIndex: String => String,
      isIndexDepth: String => Boolean
    ): UtilKeyParser = {
      val __obj = js.Dynamic.literal(changeIndex = js.Any.fromFunction3(changeIndex), getIndexList = js.Any.fromFunction1(getIndexList), getNextIndex = js.Any.fromFunction1(getNextIndex), getParentIndex = js.Any.fromFunction1(getParentIndex), isIndexDepth = js.Any.fromFunction1(isIndexDepth))
      __obj.asInstanceOf[UtilKeyParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UtilKeyParser] (val x: Self) extends AnyVal {
      
      inline def setChangeIndex(value: (String, String, String) => String): Self = StObject.set(x, "changeIndex", js.Any.fromFunction3(value))
      
      inline def setGetIndexList(value: String => Boolean): Self = StObject.set(x, "getIndexList", js.Any.fromFunction1(value))
      
      inline def setGetNextIndex(value: String => String): Self = StObject.set(x, "getNextIndex", js.Any.fromFunction1(value))
      
      inline def setGetParentIndex(value: String => String): Self = StObject.set(x, "getParentIndex", js.Any.fromFunction1(value))
      
      inline def setIsIndexDepth(value: String => Boolean): Self = StObject.set(x, "isIndexDepth", js.Any.fromFunction1(value))
    }
  }
  
  trait UtilMath extends StObject {
    
    def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double
    
    /**
      * convert radian to degree
      *
      * @return degree
      */
    def degree(radian: Double): Double
    
    def div(a: Double, b: Double): Double
    
    /**
      * a, b 의 중간값 계산을 위한 callback 함수 만들기
      *
      * @param a    first value
      * @param b     second value
      */
    def interpolateNumber(a: Double, b: Double): js.Function0[Unit]
    
    // 중간값 round 해서 계산하기
    def interpolateRound(a: Double, b: Double): js.Function0[Unit]
    
    def inverseMatrix3d(a: js.Array[Any]): js.Array[Any]
    
    def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
    
    def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
    
    def minus(a: Double, b: Double): Double
    
    def multi(a: Double, b: Double): Double
    
    /**
      * 특정 구간의 값을 자동으로 계산
      */
    def nice(min: Double, max: Double, ticks: Double, isNice: Boolean): Any
    
    def plus(a: Double, b: Double): Double
    
    /**
      * convert degree to radian
      *
      * @return radian
      */
    def radian(degree: Double): Double
    
    def remain(a: Double, b: Double): Double
    
    def resize(maxWidth: Double, maxHeight: Double, objectWidth: Double, objectHeight: Double): Any
    
    /**
      * 2d rotate
      *
      * @param radian    roate 할 radian
      * @return return.x  변환된 x
      * @return return.y  변환된 y
      *
      */
    def rotate(x: Double, y: Double, radian: Double): Any
    
    def round(num: Double, fixed: Double): Double
  }
  object UtilMath {
    
    inline def apply(
      angle: (Double, Double, Double, Double) => Double,
      degree: Double => Double,
      div: (Double, Double) => Double,
      interpolateNumber: (Double, Double) => js.Function0[Unit],
      interpolateRound: (Double, Double) => js.Function0[Unit],
      inverseMatrix3d: js.Array[Any] => js.Array[Any],
      matrix: (js.Array[Any], js.Array[Any]) => js.Array[Any],
      matrix3d: (js.Array[Any], js.Array[Any]) => js.Array[Any],
      minus: (Double, Double) => Double,
      multi: (Double, Double) => Double,
      nice: (Double, Double, Double, Boolean) => Any,
      plus: (Double, Double) => Double,
      radian: Double => Double,
      remain: (Double, Double) => Double,
      resize: (Double, Double, Double, Double) => Any,
      rotate: (Double, Double, Double) => Any,
      round: (Double, Double) => Double
    ): UtilMath = {
      val __obj = js.Dynamic.literal(angle = js.Any.fromFunction4(angle), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), interpolateNumber = js.Any.fromFunction2(interpolateNumber), interpolateRound = js.Any.fromFunction2(interpolateRound), inverseMatrix3d = js.Any.fromFunction1(inverseMatrix3d), matrix = js.Any.fromFunction2(matrix), matrix3d = js.Any.fromFunction2(matrix3d), minus = js.Any.fromFunction2(minus), multi = js.Any.fromFunction2(multi), nice = js.Any.fromFunction4(nice), plus = js.Any.fromFunction2(plus), radian = js.Any.fromFunction1(radian), remain = js.Any.fromFunction2(remain), resize = js.Any.fromFunction4(resize), rotate = js.Any.fromFunction3(rotate), round = js.Any.fromFunction2(round))
      __obj.asInstanceOf[UtilMath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UtilMath] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "angle", js.Any.fromFunction4(value))
      
      inline def setDegree(value: Double => Double): Self = StObject.set(x, "degree", js.Any.fromFunction1(value))
      
      inline def setDiv(value: (Double, Double) => Double): Self = StObject.set(x, "div", js.Any.fromFunction2(value))
      
      inline def setInterpolateNumber(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "interpolateNumber", js.Any.fromFunction2(value))
      
      inline def setInterpolateRound(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "interpolateRound", js.Any.fromFunction2(value))
      
      inline def setInverseMatrix3d(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "inverseMatrix3d", js.Any.fromFunction1(value))
      
      inline def setMatrix(value: (js.Array[Any], js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "matrix", js.Any.fromFunction2(value))
      
      inline def setMatrix3d(value: (js.Array[Any], js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "matrix3d", js.Any.fromFunction2(value))
      
      inline def setMinus(value: (Double, Double) => Double): Self = StObject.set(x, "minus", js.Any.fromFunction2(value))
      
      inline def setMulti(value: (Double, Double) => Double): Self = StObject.set(x, "multi", js.Any.fromFunction2(value))
      
      inline def setNice(value: (Double, Double, Double, Boolean) => Any): Self = StObject.set(x, "nice", js.Any.fromFunction4(value))
      
      inline def setPlus(value: (Double, Double) => Double): Self = StObject.set(x, "plus", js.Any.fromFunction2(value))
      
      inline def setRadian(value: Double => Double): Self = StObject.set(x, "radian", js.Any.fromFunction1(value))
      
      inline def setRemain(value: (Double, Double) => Double): Self = StObject.set(x, "remain", js.Any.fromFunction2(value))
      
      inline def setResize(value: (Double, Double, Double, Double) => Any): Self = StObject.set(x, "resize", js.Any.fromFunction4(value))
      
      inline def setRotate(value: (Double, Double, Double) => Any): Self = StObject.set(x, "rotate", js.Any.fromFunction3(value))
      
      inline def setRound(value: (Double, Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait UtilScaleOrdinal
    extends js.Function {
    
    def apply(x: Double): Double = js.native
    
    def domain(values: js.Array[Any]): UtilScaleOrdinal = js.native
    
    def invert(x: Double): Double = js.native
    
    def range(values: js.Array[Any]): UtilScaleOrdinal = js.native
    
    def rangeBands(interval: Double): js.Function0[Unit] = js.native
    def rangeBands(interval: Double, padding: Double): js.Function0[Unit] = js.native
    def rangeBands(interval: Double, padding: Double, outerPadding: Double): js.Function0[Unit] = js.native
    def rangeBands(interval: Double, padding: Unit, outerPadding: Double): js.Function0[Unit] = js.native
    
    def rangePoints(interval: Double): js.Function0[Unit] = js.native
    def rangePoints(interval: Double, padding: Double): js.Function0[Unit] = js.native
  }
}
