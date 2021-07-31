package typings.latestVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the latest version of an npm package.
  	@example
  	```
  	import latestVersion = require('latest-version');
  	(async () => {
  		console.log(await latestVersion('ava'));
  		//=> '0.18.0'
  		console.log(await latestVersion('@sindresorhus/df'));
  		//=> '1.0.1'
  		// Also works with semver ranges and dist-tags
  		console.log(await latestVersion('npm', {version: 'latest-5'}));
  		//=> '5.5.1'
  	})();
  	```
  	*/
  @scala.inline
  def apply(packageName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(packageName: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(packageName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("latest-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function latestVersion(
  // 	packageName: string,
  // 	options?: latestVersion.Options
  // ): Promise<string>;
  // export = latestVersion;
  @JSImport("latest-version", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof latestVersion */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof latestVersion */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		A semver range or [dist-tag](https://docs.npmjs.com/cli/dist-tag).
    		*/
    val version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
