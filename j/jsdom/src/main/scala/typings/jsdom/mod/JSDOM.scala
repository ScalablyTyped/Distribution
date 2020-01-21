package typings.jsdom.mod

import typings.node.Buffer
import typings.node.vmMod.Script
import typings.std.DocumentFragment
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "JSDOM")
@js.native
class JSDOM () extends js.Object {
  def this(html: String) = this()
  def this(html: BinaryData) = this()
  def this(html: Buffer) = this()
  def this(html: String, options: ConstructorOptions) = this()
  def this(html: BinaryData, options: ConstructorOptions) = this()
  def this(html: Buffer, options: ConstructorOptions) = this()
  val cookieJar: CookieJar = js.native
  val virtualConsole: VirtualConsole = js.native
  val window: DOMWindow = js.native
  /**
    * The nodeLocation() method will find where a DOM node is within the source document, returning the parse5 location info for the node.
    */
  def nodeLocation(node: Node): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any) | Null = js.native
  def reconfigure(settings: ReconfigureSettings): Unit = js.native
  /**
    * The built-in vm module of Node.js allows you to create Script instances,
    * which can be compiled ahead of time and then run multiple times on a given "VM context".
    * Behind the scenes, a jsdom Window is indeed a VM context.
    * To get access to this ability, use the runVMScript() method.
    */
  def runVMScript(script: Script): js.Any = js.native
  /**
    * The serialize() method will return the HTML serialization of the document, including the doctype.
    */
  def serialize(): String = js.native
}

/* static members */
@JSImport("jsdom", "JSDOM")
@js.native
object JSDOM extends js.Object {
  def fragment(html: String): DocumentFragment = js.native
  def fromFile(url: String): js.Promise[JSDOM] = js.native
  def fromFile(url: String, options: FromFileOptions): js.Promise[JSDOM] = js.native
  def fromURL(url: String): js.Promise[JSDOM] = js.native
  def fromURL(url: String, options: FromUrlOptions): js.Promise[JSDOM] = js.native
}

