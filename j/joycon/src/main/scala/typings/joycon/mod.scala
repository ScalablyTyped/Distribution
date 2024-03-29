package typings.joycon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("joycon", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JoyCon {
    def this(options: Options) = this()
  }
  
  trait AsyncLoader extends StObject {
    
    def load(filepath: String): js.Promise[Any]
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.undefined
    
    var test: js.RegExp
  }
  object AsyncLoader {
    
    inline def apply(load: String => js.Promise[Any], test: js.RegExp): AsyncLoader = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncLoader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncLoader] (val x: Self) extends AnyVal {
      
      inline def setLoad(value: String => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
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
    def load(files: js.Array[String]): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: String): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: js.Array[String], cwd: Unit, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Unit, cwd: String): js.Promise[LoadResult] = js.native
    def load(files: Unit, cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Unit, cwd: Unit, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Options): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: String): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
    def load(files: Options, cwd: Unit, stopDir: String): js.Promise[LoadResult] = js.native
    
    def loadSync(): LoadResult = js.native
    def loadSync(files: js.Array[String]): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: String): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: String, stopDir: String): LoadResult = js.native
    def loadSync(files: js.Array[String], cwd: Unit, stopDir: String): LoadResult = js.native
    def loadSync(files: Unit, cwd: String): LoadResult = js.native
    def loadSync(files: Unit, cwd: String, stopDir: String): LoadResult = js.native
    def loadSync(files: Unit, cwd: Unit, stopDir: String): LoadResult = js.native
    def loadSync(files: Options): LoadResult = js.native
    def loadSync(files: Options, cwd: String): LoadResult = js.native
    def loadSync(files: Options, cwd: String, stopDir: String): LoadResult = js.native
    def loadSync(files: Options, cwd: Unit, stopDir: String): LoadResult = js.native
    
    var options: Options = js.native
    
    def removeLoader(name: String): this.type = js.native
    
    def resolve(): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String]): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: js.Array[String], cwd: Unit, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Unit, cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: Unit, cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Unit, cwd: Unit, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Options): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: String): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: String, stopDir: String): js.Promise[String | Null] = js.native
    def resolve(files: Options, cwd: Unit, stopDir: String): js.Promise[String | Null] = js.native
    
    def resolveSync(): String | Null = js.native
    def resolveSync(files: js.Array[String]): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: String): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
    def resolveSync(files: js.Array[String], cwd: Unit, stopDir: String): String | Null = js.native
    def resolveSync(files: Unit, cwd: String): String | Null = js.native
    def resolveSync(files: Unit, cwd: String, stopDir: String): String | Null = js.native
    def resolveSync(files: Unit, cwd: Unit, stopDir: String): String | Null = js.native
    def resolveSync(files: Options): String | Null = js.native
    def resolveSync(files: Options, cwd: String): String | Null = js.native
    def resolveSync(files: Options, cwd: String, stopDir: String): String | Null = js.native
    def resolveSync(files: Options, cwd: Unit, stopDir: String): String | Null = js.native
  }
  
  trait LoadResult extends StObject {
    
    /* file data */
    var data: js.UndefOr[Any] = js.undefined
    
    /* file path */
    var path: js.UndefOr[String] = js.undefined
  }
  object LoadResult {
    
    inline def apply(): LoadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadResult] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait MultiLoader extends StObject {
    
    def load(filepath: String): js.Promise[Any]
    
    def loadSync(filepath: String): Any
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.undefined
    
    var test: js.RegExp
  }
  object MultiLoader {
    
    inline def apply(load: String => js.Promise[Any], loadSync: String => Any, test: js.RegExp): MultiLoader = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), loadSync = js.Any.fromFunction1(loadSync), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiLoader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiLoader] (val x: Self) extends AnyVal {
      
      inline def setLoad(value: String => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadSync(value: String => Any): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /* the directory to search from */
    var cwd: js.UndefOr[String] = js.undefined
    
    /* a list of files to search */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /* the key in package.json to read data at */
    var packageKey: js.UndefOr[String] = js.undefined
    
    /* the function used to parse json */
    var parseJSON: js.UndefOr[js.Function1[/* str */ String, Any]] = js.undefined
    
    /* the directory to stop searching */
    var stopDir: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      inline def setPackageKeyUndefined: Self = StObject.set(x, "packageKey", js.undefined)
      
      inline def setParseJSON(value: /* str */ String => Any): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
      
      inline def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
  
  trait SyncLoader extends StObject {
    
    def loadSync(filepath: String): Any
    
    /** Optional loader name */
    var name: js.UndefOr[String] = js.undefined
    
    var test: js.RegExp
  }
  object SyncLoader {
    
    inline def apply(loadSync: String => Any, test: js.RegExp): SyncLoader = {
      val __obj = js.Dynamic.literal(loadSync = js.Any.fromFunction1(loadSync), test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncLoader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncLoader] (val x: Self) extends AnyVal {
      
      inline def setLoadSync(value: String => Any): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
}
