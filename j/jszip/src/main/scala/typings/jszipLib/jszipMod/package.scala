package typings
package jszipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  type InputFileFormat = java.lang.String | stdLib.Uint8Array | js.Array[scala.Double] | nodeLib.NodeJSNs.ReadableStream | stdLib.ArrayBuffer | stdLib.Blob
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, scala.Unit]
}
