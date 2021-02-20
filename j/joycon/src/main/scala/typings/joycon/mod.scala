package typings.joycon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("joycon", JSImport.Default)
  @js.native
  class default () extends JoyCon {
    def this(options: Options) = this()
  }
  
  @js.native
  trait AsyncLoader extends StObject {
    
    def load(filepath: String): js.Promise[_] = js.native
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.native
    
    var test: RegExp = js.native
  }
  object AsyncLoader {
    
    @scala.inline
    def apply(load: String => js.Promise[_], test: RegExp): AsyncLoader = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncLoader]
    }
    
    @scala.inline
    implicit class AsyncLoaderMutableBuilder[Self <: AsyncLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: String => js.Promise[_]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTest(value: RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JoyCon extends StObject {
    
    def addLoader(loader: AsyncLoader): this.type = js.native
    def addLoader(loader: MultiLoader): this.type = js.native
    def addLoader(loader: SyncLoader): this.type = js.native
    
    /** Clear internal cache */
    def clearCache(): this.type = js.native
    
    def load(): js.Promise[LoadResult] = js.native
    def load(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: js.UndefOr[scala.Nothing], cwd: String): js.Promise[LoadResult] = js.native
    def load(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String]): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: String): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Options): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: String): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    
    def loadSync(): LoadResult = js.native
    def loadSync(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
    def loadSync(files: js.UndefOr[scala.Nothing], cwd: String): LoadResult = js.native
    def loadSync(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): LoadResult = js.native
    def loadSync(files: js.Array[String]): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: String): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: String, stopDir: String): LoadResult = js.native
    def loadSync(files: Options): LoadResult = js.native
    def loadSync(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
    def loadSync(files: Options, cwd: String): LoadResult = js.native
    def loadSync(files: Options, cwd: String, stopDir: String): LoadResult = js.native
    
    var options: Options = js.native
    
    def removeLoader(name: String): this.type = js.native
    
    def resolve(): js.Promise[String | Null] = js.native
    def resolve(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: js.UndefOr[scala.Nothing], cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String]): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Options): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    
    def resolveSync(): String | Null = js.native
    def resolveSync(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
    def resolveSync(files: js.UndefOr[scala.Nothing], cwd: String): String | Null = js.native
    def resolveSync(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): String | Null = js.native
    def resolveSync(files: js.Array[String]): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: String): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
    def resolveSync(files: Options): String | Null = js.native
    def resolveSync(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
    def resolveSync(files: Options, cwd: String): String | Null = js.native
    def resolveSync(files: Options, cwd: String, stopDir: String): String | Null = js.native
  }
  
  @js.native
  trait LoadResult extends StObject {
    
    /* file data */
    var data: js.UndefOr[js.Any] = js.native
    
    /* file path */
    var path: js.UndefOr[String] = js.native
  }
  object LoadResult {
    
    @scala.inline
    def apply(): LoadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadResult]
    }
    
    @scala.inline
    implicit class LoadResultMutableBuilder[Self <: LoadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait MultiLoader extends StObject {
    
    def load(filepath: String): js.Promise[_] = js.native
    
    def loadSync(filepath: String): js.Any = js.native
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.native
    
    var test: RegExp = js.native
  }
  object MultiLoader {
    
    @scala.inline
    def apply(load: String => js.Promise[_], loadSync: String => js.Any, test: RegExp): MultiLoader = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), loadSync = js.Any.fromFunction1(loadSync), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiLoader]
    }
    
    @scala.inline
    implicit class MultiLoaderMutableBuilder[Self <: MultiLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: String => js.Promise[_]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadSync(value: String => js.Any): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTest(value: RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /* the directory to search from */
    var cwd: js.UndefOr[String] = js.native
    
    /* a list of files to search */
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /* the key in package.json to read data at */
    var packageKey: js.UndefOr[String] = js.native
    
    /* the function used to parse json */
    var parseJSON: js.UndefOr[js.Function1[/* str */ String, _]] = js.native
    
    /* the directory to stop searching */
    var stopDir: js.UndefOr[String] = js.native
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageKeyUndefined: Self = StObject.set(x, "packageKey", js.undefined)
      
      @scala.inline
      def setParseJSON(value: /* str */ String => _): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      @scala.inline
      def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
  
  @js.native
  trait SyncLoader extends StObject {
    
    def loadSync(filepath: String): js.Any = js.native
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.native
    
    var test: RegExp = js.native
  }
  object SyncLoader {
    
    @scala.inline
    def apply(loadSync: String => js.Any, test: RegExp): SyncLoader = {
      val __obj = js.Dynamic.literal(loadSync = js.Any.fromFunction1(loadSync), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncLoader]
    }
    
    @scala.inline
    implicit class SyncLoaderMutableBuilder[Self <: SyncLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadSync(value: String => js.Any): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTest(value: RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
}
