package typings.jssip

import typings.jssip.constantsMod.causes
import typings.jssip.uriMod.URI
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jssip/lib/Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateMD5(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMD5")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cloneArray[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def cloneObject[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cloneObject[T](obj: T, fallback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def closeMediaStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMediaStream")().asInstanceOf[Unit]
  inline def closeMediaStream(stream: MediaStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMediaStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def escapeUser(user: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUser")(user.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRandomTestNetIP(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomTestNetIP")().asInstanceOf[String]
  
  inline def hasMethods(obj: Any, methodNames: String*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMethods")(List(obj.asInstanceOf[js.Any]).`++`(methodNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def headerize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headerize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hostType(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostType")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDecimal(num: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def newTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newTag")().asInstanceOf[String]
  
  inline def newUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newUUID")().asInstanceOf[String]
  
  inline def normalizeTarget(target: String): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
  inline def normalizeTarget(target: String, domain: String): js.UndefOr[URI] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[URI]]
  inline def normalizeTarget(target: URI): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
  inline def normalizeTarget(target: URI, domain: String): js.UndefOr[URI] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[URI]]
  
  inline def sipErrorCause(status_code: Double): causes = ^.asInstanceOf[js.Dynamic].applyDynamic("sipErrorCause")(status_code.asInstanceOf[js.Any]).asInstanceOf[causes]
  
  inline def strUtf8Length(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("str_utf8_length")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
}
