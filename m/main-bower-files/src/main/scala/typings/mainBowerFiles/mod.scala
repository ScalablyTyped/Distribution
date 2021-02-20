package typings.mainBowerFiles

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("main-bower-files", JSImport.Namespace)
  @js.native
  def apply(): js.Array[String] = js.native
  @JSImport("main-bower-files", JSImport.Namespace)
  @js.native
  def apply(options: IOptions): js.Array[String] = js.native
  
  type IFilterFunction = js.Function1[/* filepath */ String, Boolean]
  
  @js.native
  trait IOptions extends StObject {
    
    var checkExistence: js.UndefOr[Boolean] = js.native
    
    var debugging: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var filter: js.UndefOr[RegExp | IFilterFunction | String | js.Array[String]] = js.native
    
    var includeDev: js.UndefOr[Boolean | String] = js.native
    
    var includeSelf: js.UndefOr[Boolean] = js.native
    
    var main: js.UndefOr[String | js.Array[String] | js.Object] = js.native
    
    var paths: js.UndefOr[IPaths | String] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckExistence(value: Boolean): Self = StObject.set(x, "checkExistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckExistenceUndefined: Self = StObject.set(x, "checkExistence", js.undefined)
      
      @scala.inline
      def setDebugging(value: Boolean): Self = StObject.set(x, "debugging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggingUndefined: Self = StObject.set(x, "debugging", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFilter(value: RegExp | IFilterFunction | String | js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* filepath */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setIncludeDev(value: Boolean | String): Self = StObject.set(x, "includeDev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDevUndefined: Self = StObject.set(x, "includeDev", js.undefined)
      
      @scala.inline
      def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
      
      @scala.inline
      def setMain(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setMainVarargs(value: String*): Self = StObject.set(x, "main", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: IPaths | String): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    }
  }
  
  @js.native
  trait IPaths extends StObject {
    
    var bowerDirectory: js.UndefOr[String] = js.native
    
    var bowerJson: js.UndefOr[String] = js.native
    
    var bowerrc: js.UndefOr[String] = js.native
  }
  object IPaths {
    
    @scala.inline
    def apply(): IPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPaths]
    }
    
    @scala.inline
    implicit class IPathsMutableBuilder[Self <: IPaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBowerDirectory(value: String): Self = StObject.set(x, "bowerDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBowerDirectoryUndefined: Self = StObject.set(x, "bowerDirectory", js.undefined)
      
      @scala.inline
      def setBowerJson(value: String): Self = StObject.set(x, "bowerJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBowerJsonUndefined: Self = StObject.set(x, "bowerJson", js.undefined)
      
      @scala.inline
      def setBowerrc(value: String): Self = StObject.set(x, "bowerrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBowerrcUndefined: Self = StObject.set(x, "bowerrc", js.undefined)
    }
  }
}
