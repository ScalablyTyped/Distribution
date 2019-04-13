package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Console extends js.Object {
  /**
    * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
    */
  val console: hexoLib.hexoMod.extendNs.Console
  /**
    * A deployer helps users quickly deploy their site to a remote server without complicated commands.
    */
  val deployer: hexoLib.hexoMod.extendNs.Deployer
  /**
    * A filter is used to modify some specified data. Hexo passes data to filters in sequence and the filters then modify the data one after the other.
    */
  val filter: hexoLib.hexoMod.extendNs.Filter
  /**
    * A generator builds routes based on processed files.
    */
  val generator: hexoLib.hexoMod.extendNs.Generator
  /**
    * A helper makes it easy to quickly add snippets to your templates. We recommend using helpers instead of templates when you’re dealing with more complicated code.
    */
  val helper: hexoLib.hexoMod.extendNs.Helper
  /**
    * A migrator helps users migrate from other systems to Hexo.
    */
  val migrator: hexoLib.hexoMod.extendNs.Migrator
  /**
    * A processor is used to process source files in the source folder.
    */
  val processor: hexoLib.hexoMod.extendNs.Processor
  /**
    * A renderer is used to render content.
    */
  val renderer: hexoLib.hexoMod.extendNs.Renderer
  /**
    * A tag allows users to quickly and easily insert snippets into their posts.
    */
  val tag: hexoLib.hexoMod.extendNs.Tag
}

object Anon_Console {
  @scala.inline
  def apply(
    console: hexoLib.hexoMod.extendNs.Console,
    deployer: hexoLib.hexoMod.extendNs.Deployer,
    filter: hexoLib.hexoMod.extendNs.Filter,
    generator: hexoLib.hexoMod.extendNs.Generator,
    helper: hexoLib.hexoMod.extendNs.Helper,
    migrator: hexoLib.hexoMod.extendNs.Migrator,
    processor: hexoLib.hexoMod.extendNs.Processor,
    renderer: hexoLib.hexoMod.extendNs.Renderer,
    tag: hexoLib.hexoMod.extendNs.Tag
  ): Anon_Console = {
    val __obj = js.Dynamic.literal(console = console, deployer = deployer, filter = filter, generator = generator, helper = helper, migrator = migrator, processor = processor, renderer = renderer, tag = tag)
  
    __obj.asInstanceOf[Anon_Console]
  }
}

