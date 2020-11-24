package typings.hexo.anon

import typings.hexo.mod.extend.Deployer
import typings.hexo.mod.extend.Filter
import typings.hexo.mod.extend.Generator
import typings.hexo.mod.extend.Helper
import typings.hexo.mod.extend.Migrator
import typings.hexo.mod.extend.Processor
import typings.hexo.mod.extend.Renderer
import typings.hexo.mod.extend.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends js.Object {
  
  /**
    * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
    */
  val console: typings.hexo.mod.extend.Console = js.native
  
  /**
    * A deployer helps users quickly deploy their site to a remote server without complicated commands.
    */
  val deployer: Deployer = js.native
  
  /**
    * A filter is used to modify some specified data. Hexo passes data to filters in sequence and the filters then modify the data one after the other.
    */
  val filter: Filter = js.native
  
  /**
    * A generator builds routes based on processed files.
    */
  val generator: Generator = js.native
  
  /**
    * A helper makes it easy to quickly add snippets to your templates. We recommend using helpers instead of templates when you’re dealing with more complicated code.
    */
  val helper: Helper = js.native
  
  /**
    * A migrator helps users migrate from other systems to Hexo.
    */
  val migrator: Migrator = js.native
  
  /**
    * A processor is used to process source files in the source folder.
    */
  val processor: Processor = js.native
  
  /**
    * A renderer is used to render content.
    */
  val renderer: Renderer = js.native
  
  /**
    * A tag allows users to quickly and easily insert snippets into their posts.
    */
  val tag: Tag = js.native
}
object Console {
  
  @scala.inline
  def apply(
    console: typings.hexo.mod.extend.Console,
    deployer: Deployer,
    filter: Filter,
    generator: Generator,
    helper: Helper,
    migrator: Migrator,
    processor: Processor,
    renderer: Renderer,
    tag: Tag
  ): Console = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], deployer = deployer.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], migrator = migrator.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Console]
  }
  
  @scala.inline
  implicit class ConsoleOps[Self <: Console] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsole(value: typings.hexo.mod.extend.Console): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployer(value: Deployer): Self = this.set("deployer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerator(value: Generator): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: Helper): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrator(value: Migrator): Self = this.set("migrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessor(value: Processor): Self = this.set("processor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
