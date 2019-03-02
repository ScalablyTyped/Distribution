package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "JSDOM")
@js.native
class JSDOM () extends js.Object {
  def this(html: java.lang.String) = this()
  def this(html: BinaryData) = this()
  def this(html: nodeLib.Buffer) = this()
  def this(html: java.lang.String, options: ConstructorOptions) = this()
  def this(html: BinaryData, options: ConstructorOptions) = this()
  def this(html: nodeLib.Buffer, options: ConstructorOptions) = this()
  val cookieJar: CookieJar = js.native
  val virtualConsole: VirtualConsole = js.native
  val window: DOMWindow = js.native
  /**
    * The nodeLocation() method will find where a DOM node is within the source document, returning the parse5 location info for the node.
    */
  def nodeLocation(node: stdLib.Node): (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any) | scala.Null = js.native
  def reconfigure(settings: ReconfigureSettings): scala.Unit = js.native
  /**
    * The built-in vm module of Node.js allows you to create Script instances,
    * which can be compiled ahead of time and then run multiple times on a given "VM context".
    * Behind the scenes, a jsdom Window is indeed a VM context.
    * To get access to this ability, use the runVMScript() method.
    */
  def runVMScript(script: nodeLib.vmMod.Script): js.Any = js.native
  /**
    * The serialize() method will return the HTML serialization of the document, including the doctype.
    */
  def serialize(): java.lang.String = js.native
}

/* static members */
@JSImport("jsdom", "JSDOM")
@js.native
object JSDOM extends js.Object {
  def fragment(html: java.lang.String): stdLib.DocumentFragment = js.native
  def fromFile(url: java.lang.String): js.Promise[jsdomLib.jsdomMod.JSDOM] = js.native
  def fromFile(url: java.lang.String, options: jsdomLib.jsdomMod.FromFileOptions): js.Promise[jsdomLib.jsdomMod.JSDOM] = js.native
  def fromURL(url: java.lang.String): js.Promise[jsdomLib.jsdomMod.JSDOM] = js.native
  def fromURL(url: java.lang.String, options: jsdomLib.jsdomMod.FromUrlOptions): js.Promise[jsdomLib.jsdomMod.JSDOM] = js.native
}

