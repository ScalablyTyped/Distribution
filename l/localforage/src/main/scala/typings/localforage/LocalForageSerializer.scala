package typings.localforage

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageSerializer extends StObject {
  
  def bufferToString(buffer: js.typedarray.ArrayBuffer): String = js.native
  
  def deserialize[T](value: String): T | js.typedarray.ArrayBuffer | Blob = js.native
  
  def serialize[T](value: T, callback: js.Function2[/* value */ String, /* error */ Any, Unit]): Unit = js.native
  def serialize[T](
    value: js.typedarray.ArrayBuffer,
    callback: js.Function2[/* value */ String, /* error */ Any, Unit]
  ): Unit = js.native
  def serialize[T](value: Blob, callback: js.Function2[/* value */ String, /* error */ Any, Unit]): Unit = js.native
  
  def stringToBuffer(serializedString: String): js.typedarray.ArrayBuffer = js.native
}
