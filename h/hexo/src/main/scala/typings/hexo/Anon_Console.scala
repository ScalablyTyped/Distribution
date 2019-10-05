package typings.hexo

import typings.hexo.hexoMod.extend.Console
import typings.hexo.hexoMod.extend.Deployer
import typings.hexo.hexoMod.extend.Filter
import typings.hexo.hexoMod.extend.Generator
import typings.hexo.hexoMod.extend.Helper
import typings.hexo.hexoMod.extend.Migrator
import typings.hexo.hexoMod.extend.Processor
import typings.hexo.hexoMod.extend.Renderer
import typings.hexo.hexoMod.extend.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Console extends js.Object {
  /**
    * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
    */
  val console: Console
  /**
    * A deployer helps users quickly deploy their site to a remote server without complicated commands.
    */
  val deployer: Deployer
  /**
    * A filter is used to modify some specified data. Hexo passes data to filters in sequence and the filters then modify the data one after the other.
    */
  val filter: Filter
  /**
    * A generator builds routes based on processed files.
    */
  val generator: Generator
  /**
    * A helper makes it easy to quickly add snippets to your templates. We recommend using helpers instead of templates when you’re dealing with more complicated code.
    */
  val helper: Helper
  /**
    * A migrator helps users migrate from other systems to Hexo.
    */
  val migrator: Migrator
  /**
    * A processor is used to process source files in the source folder.
    */
  val processor: Processor
  /**
    * A renderer is used to render content.
    */
  val renderer: Renderer
  /**
    * A tag allows users to quickly and easily insert snippets into their posts.
    */
  val tag: Tag
}

object Anon_Console {
  @scala.inline
  def apply(
    console: Console,
    deployer: Deployer,
    filter: Filter,
    generator: Generator,
    helper: Helper,
    migrator: Migrator,
    processor: Processor,
    renderer: Renderer,
    tag: Tag
  ): Anon_Console = {
    val __obj = js.Dynamic.literal(console = console, deployer = deployer, filter = filter, generator = generator, helper = helper, migrator = migrator, processor = processor, renderer = renderer, tag = tag)
  
    __obj.asInstanceOf[Anon_Console]
  }
}

