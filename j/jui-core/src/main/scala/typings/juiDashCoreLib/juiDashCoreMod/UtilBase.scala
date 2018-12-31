package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilBase extends js.Object {
  /** check browser agent */
  var browser: juiDashCoreLib.Anon_Mozilla = js.native
  var isTouch: scala.Boolean = js.native
  def ajax(data: js.Any): scala.Unit = js.native
  /**
    * Base64 디코딩
    */
  def atob(input: java.lang.String): js.Any = js.native
  /**
    * Base64 인코딩
    */
  def btoa(input: js.Any): java.lang.String = js.native
  /**
    * split array by length
    */
  def chunk(arr: js.Array[_], len: scala.Double): js.Array[_] = js.native
  /**
    * implements object clone
    * @param obj 복사할 객체
    */
  def clone(obj: js.Any): js.Array[_] = js.native
  /**
    *
    * 유니크 아이디 생성
    *
    * @param key  prefix string
    * @return 생성된 아이디 문자열
    */
  def createId(key: java.lang.String): java.lang.String = js.native
  /**
    * csv 다운로드 링크로 변환
    *
    * @return data uri string
    */
  def csvToBase64(csv: java.lang.String): java.lang.String = js.native
  def csvToData(keys: js.Array[java.lang.String], csv: java.lang.String, csvNumber: scala.Double): js.Array[_] = js.native
  /**
    * data 를 csv 로 변환한다.
    *
    * @return  변환된 csv 문자열
    */
  def dataToCsv(keys: js.Array[java.lang.String], dataList: js.Array[_], dataSize: scala.Double): java.lang.String = js.native
  def dataToCsv2(options: js.Any): java.lang.String = js.native
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
  def dateFormat(date: stdLib.Date, format: java.lang.String): java.lang.String = js.native
  def dateFormat(date: stdLib.Date, format: java.lang.String, utc: scala.Boolean): java.lang.String = js.native
  /**
    * implements object deep clone
    */
  def deepClone(obj: js.Any, emit: js.Any): js.Array[_] = js.native
  /**
    * Check that it matches the end of a string search string.
    *
    * @return position
    */
  def endsWith(str: java.lang.String, searchString: java.lang.String): scala.Double = js.native
  def endsWith(str: java.lang.String, searchString: java.lang.String, position: scala.Double): scala.Double = js.native
  /**
    * implements object extend
    */
  def extend(origin: js.Any, add: js.Any, skip: scala.Boolean): js.Any = js.native
  /**
    * file 에서 csv 컨텐츠 로드
    */
  def fileToCsv(fileText: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    *
    * csv 에서 필드 얻어오기
    *
    */
  def getCsvFields(fields: js.Array[java.lang.String], csvFields: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def inArray(target: js.Any, list: js.Array[_]): scala.Double = js.native
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
  def inherit(ctor: js.Function1[/* repeated */ js.Any, _], superCtor: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  /**
    * 최적화된 루프 생성 (5단계로 나눔)
    *
    * @param total   loop count
    * @return 최적화된 루프 콜백 (index, groupIndex 2가지 파라미터를 받는다.)
    */
  def loop(total: scala.Double): js.Function2[/* index */ scala.Double, /* groupIndex */ scala.Double, scala.Unit] = js.native
  def loop(total: scala.Double, context: js.Any): js.Function2[/* index */ scala.Double, /* groupIndex */ scala.Double, scala.Unit] = js.native
  /**
    * 배열을 사용해서 최적화된 루프로 생성한다.
    *
    *
    * @param data 루프로 생성될 배열
    * @return 최적화된 루프 콜백 (data, index, groupIndex 3가지 파라미터를 받는다.)
    */
  def loopArray(data: js.Array[_]): js.Function3[/* data */ js.Any, /* index */ scala.Double, /* groupIndex */ scala.Double, scala.Unit] = js.native
  def loopArray(data: js.Array[_], context: js.Any): js.Function3[/* data */ js.Any, /* index */ scala.Double, /* groupIndex */ scala.Double, scala.Unit] = js.native
  /**
    * 배열의 키 기반 인덱스를 생성한다.
    *
    * 개별 값 별로 멀티 인덱스를 생성한다.
    *
    * @return 생성된 인덱스
    */
  def makeIndex(data: js.Array[_], keyField: java.lang.String): js.Any = js.native
  def param(data: js.Any): java.lang.String = js.native
  /**
    * convert px to integer
    */
  def pxToInt(px: java.lang.String): scala.Double = js.native
  def pxToInt(px: scala.Double): scala.Double = js.native
  def ready(args: js.Any*): scala.Unit = js.native
  /**
    * add event in window resize event
    * @param ms delay time
    */
  def resize(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double): scala.Unit = js.native
  /**
    * caculate callback runtime
    */
  def runtime(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def scrollWidth(): scala.Double = js.native
  /**
    * use QuickSort
    */
  def sort(array: js.Array[_]): js.Function2[/* array */ js.Array[scala.Double], /* isClone */ scala.Boolean, this.type] = js.native
  /**
    * Check that it matches the starting string search string.
    *
    * @return position
    */
  def startsWith(str: java.lang.String, searchString: java.lang.String): scala.Double = js.native
  def startsWith(str: java.lang.String, searchString: java.lang.String, position: scala.Double): scala.Double = js.native
  /**
    *
    * xml 문자열로 svg datauri 생성
    *
    * @return 변환된 data uri 링크
    */
  def svgToBase64(xml: java.lang.String): java.lang.String = js.native
  /**
    * parsing template string
    */
  def template(html: java.lang.String): (js.Function1[/* obj */ js.Any, java.lang.String]) | java.lang.String = js.native
  def template(html: java.lang.String, obj: js.Any): (js.Function1[/* obj */ js.Any, java.lang.String]) | java.lang.String = js.native
  /**
    * implement async loop without blocking ui
    *
    * @param total   loop count
    */
  def timeLoop(total: scala.Double): js.Function1[/* index */ scala.Double, scala.Unit] = js.native
  def timeLoop(total: scala.Double, context: js.Any): js.Function1[/* index */ scala.Double, scala.Unit] = js.native
  def trim(text: java.lang.String): java.lang.String = js.native
  /**
    * check data  type
    * @param t  type string
    * @param v value object
    */
  def typeCheck(typeName: java.lang.String, value: js.Any): scala.Boolean = js.native
  def typeCheckObj(uiObj: js.Any, list: js.Any): scala.Unit = js.native
}

