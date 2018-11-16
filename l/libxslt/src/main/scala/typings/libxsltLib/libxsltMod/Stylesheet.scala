package typings
package libxsltLib.libxsltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stylesheet extends js.Object {
  @JSName("apply")
  def apply(source: java.lang.String): java.lang.String = js.native
  @JSName("apply")
  def apply(source: java.lang.String, callback: libxsltLib.internalDashTypesMod.ApplyStringCallback): scala.Unit = js.native
  @JSName("apply")
  def apply(source: java.lang.String, params: js.Object): java.lang.String = js.native
  @JSName("apply")
  def apply(source: java.lang.String, params: js.Object, options: ApplyOptions): libxsltLib.internalDashTypesMod.ApplyResult = js.native
  @JSName("apply")
  def apply(
    source: java.lang.String,
    params: js.Object,
    options: ApplyOptions,
    callback: libxsltLib.internalDashTypesMod.ApplyCallback
  ): scala.Unit = js.native
  @JSName("apply")
  def apply(source: libxmljsLib.libxmljsMod.Document): libxmljsLib.libxmljsMod.Document = js.native
  @JSName("apply")
  def apply(
    source: libxmljsLib.libxmljsMod.Document,
    callback: libxsltLib.internalDashTypesMod.ApplyStringCallback
  ): scala.Unit = js.native
  @JSName("apply")
  def apply(source: libxmljsLib.libxmljsMod.Document, params: js.Object): libxmljsLib.libxmljsMod.Document = js.native
  @JSName("apply")
  def apply(source: libxmljsLib.libxmljsMod.Document, params: js.Object, options: ApplyOptions): libxsltLib.internalDashTypesMod.ApplyResult = js.native
  @JSName("apply")
  def apply(
    source: libxmljsLib.libxmljsMod.Document,
    params: js.Object,
    options: ApplyOptions,
    callback: libxsltLib.internalDashTypesMod.ApplyCallback
  ): scala.Unit = js.native
  def applyToFile(sourcePath: java.lang.String, callback: libxsltLib.internalDashTypesMod.ApplyStringCallback): scala.Unit = js.native
  def applyToFile(
    sourcePath: java.lang.String,
    params: js.Object,
    options: ApplyOptions,
    callback: libxsltLib.internalDashTypesMod.ApplyStringCallback
  ): scala.Unit = js.native
}

