package typings.hexo

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.mod.extend.Deployer
import typings.hexo.mod.extend.Filter
import typings.hexo.mod.extend.Generator
import typings.hexo.mod.extend.Helper
import typings.hexo.mod.extend.Migrator
import typings.hexo.mod.extend.Processor
import typings.hexo.mod.extend.Renderer
import typings.hexo.mod.extend.Tag
import typings.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    val args: ParsedArgs
    
    val debug: Boolean
    
    val env: String
    
    val init: Boolean
    
    val safe: Boolean
    
    val silent: Boolean
    
    val version: String
  }
  object Args {
    
    inline def apply(
      args: ParsedArgs,
      debug: Boolean,
      env: String,
      init: Boolean,
      safe: Boolean,
      silent: Boolean,
      version: String
    ): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: ParsedArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Autodetect extends StObject {
    
    val auto_detect: Boolean
    
    val enable: Boolean
    
    val line_number: Boolean
    
    val tab_replace: String | Null
  }
  object Autodetect {
    
    inline def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean): Autodetect = {
      val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any], tab_replace = null)
      __obj.asInstanceOf[Autodetect]
    }
    
    extension [Self <: Autodetect](x: Self) {
      
      inline def setAuto_detect(value: Boolean): Self = StObject.set(x, "auto_detect", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setLine_number(value: Boolean): Self = StObject.set(x, "line_number", value.asInstanceOf[js.Any])
      
      inline def setTab_replace(value: String): Self = StObject.set(x, "tab_replace", value.asInstanceOf[js.Any])
      
      inline def setTab_replaceNull: Self = StObject.set(x, "tab_replace", null)
    }
  }
  
  trait Console extends StObject {
    
    /**
      * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
      */
    val console: typings.hexo.mod.extend.Console
    
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
  object Console {
    
    inline def apply(
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
    
    extension [Self <: Console](x: Self) {
      
      inline def setConsole(value: typings.hexo.mod.extend.Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setDeployer(value: Deployer): Self = StObject.set(x, "deployer", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setGenerator(value: Generator): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setHelper(value: Helper): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setMigrator(value: Migrator): Self = StObject.set(x, "migrator", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: Processor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var path: String
  }
  object Content {
    
    inline def apply(content: String, path: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Desc extends StObject {
    
    var desc: String
    
    var name: String
  }
  object Desc {
    
    inline def apply(desc: String, name: String): Desc = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Desc]
    }
    
    extension [Self <: Desc](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var content: String
  }
  object Dictkey {
    
    inline def apply(content: String): Dictkey = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait Path
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var path: String
    
    var text: String
  }
  object Path {
    
    inline def apply(path: String, text: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
