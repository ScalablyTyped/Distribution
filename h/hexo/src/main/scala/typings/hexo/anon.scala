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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    val args: ParsedArgs = js.native
    
    val debug: Boolean = js.native
    
    val env: String = js.native
    
    val init: Boolean = js.native
    
    val safe: Boolean = js.native
    
    val silent: Boolean = js.native
    
    val version: String = js.native
  }
  object Args {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: ParsedArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Autodetect extends StObject {
    
    val auto_detect: Boolean = js.native
    
    val enable: Boolean = js.native
    
    val line_number: Boolean = js.native
    
    val tab_replace: String | Null = js.native
  }
  object Autodetect {
    
    @scala.inline
    def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean): Autodetect = {
      val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autodetect]
    }
    
    @scala.inline
    implicit class AutodetectMutableBuilder[Self <: Autodetect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_detect(value: Boolean): Self = StObject.set(x, "auto_detect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_number(value: Boolean): Self = StObject.set(x, "line_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_replace(value: String): Self = StObject.set(x, "tab_replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_replaceNull: Self = StObject.set(x, "tab_replace", null)
    }
  }
  
  @js.native
  trait Console extends StObject {
    
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
    implicit class ConsoleMutableBuilder[Self <: Console] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: typings.hexo.mod.extend.Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeployer(value: Deployer): Self = StObject.set(x, "deployer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerator(value: Generator): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelper(value: Helper): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrator(value: Migrator): Self = StObject.set(x, "migrator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessor(value: Processor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var path: String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String, path: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Desc extends StObject {
    
    var desc: String = js.native
    
    var name: String = js.native
  }
  object Desc {
    
    @scala.inline
    def apply(desc: String, name: String): Desc = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Desc]
    }
    
    @scala.inline
    implicit class DescMutableBuilder[Self <: Desc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var content: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(content: String): Dictkey = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.native
    
    var flag: js.UndefOr[String] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait Path
    extends /* key */ StringDictionary[js.Any] {
    
    var path: String = js.native
    
    var text: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: String, text: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
