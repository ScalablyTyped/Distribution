package typings.lcovParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parses an LCOV code coverage file:
    * ```
    *  parse('./path/to/file.info', function(err, data) {
    *      //process the data here
    *  });
    * ```
    *
    * The first argument can also be an LCOV string to parse:
    * ```
    *  parse(lcovString, function(err, data) {
    *      //process the data here
    *  });
    * ```
    *
    * @param file Path to the LCOV file or string to parse
    * @param cb Callback: first arg is `null` or error string,
    *                     second arg is parsed data or `undefined` if an error occurred
    */
  inline def apply(
    file: String,
    cb: js.Function2[/* err */ Null | String, /* data */ js.UndefOr[js.Array[LcovFile]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("lcov-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses an LCOV code coverage string:
    * ```
    *  parse(lcovString, function(err, data) {
    *      //process the data here
    *  });
    * ```
    *
    * @param str LCOV string to parse
    * @param cb Callback: first arg is `null` or error string,
    *                     second arg is parsed data or `undefined` if an error occurred
    */
  inline def source(
    str: String,
    cb: js.Function2[/* err */ Null | String, /* data */ js.UndefOr[js.Array[LcovFile]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(str.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Branch coverage detail
    */
  trait LcovBranch extends StObject {
    
    var block: Double
    
    var branch: Double
    
    var line: Double
    
    var taken: Double
  }
  object LcovBranch {
    
    inline def apply(block: Double, branch: Double, line: Double, taken: Double): LcovBranch = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovBranch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LcovBranch] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: Double): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setTaken(value: Double): Self = StObject.set(x, "taken", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Code coverage for a file
    */
  trait LcovFile extends StObject {
    
    var branches: LcovPart[LcovBranch]
    
    var file: String
    
    var functions: LcovPart[LcovFunc]
    
    var lines: LcovPart[LcovLine]
    
    var title: String
  }
  object LcovFile {
    
    inline def apply(
      branches: LcovPart[LcovBranch],
      file: String,
      functions: LcovPart[LcovFunc],
      lines: LcovPart[LcovLine],
      title: String
    ): LcovFile = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LcovFile] (val x: Self) extends AnyVal {
      
      inline def setBranches(value: LcovPart[LcovBranch]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: LcovPart[LcovFunc]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLines(value: LcovPart[LcovLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Function coverage detail
    */
  trait LcovFunc extends StObject {
    
    var hit: Double
    
    var line: Double
    
    var name: String
  }
  object LcovFunc {
    
    inline def apply(hit: Double, line: Double, name: String): LcovFunc = {
      val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovFunc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LcovFunc] (val x: Self) extends AnyVal {
      
      inline def setHit(value: Double): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Line coverage detail
    */
  trait LcovLine extends StObject {
    
    var hit: Double
    
    var line: Double
  }
  object LcovLine {
    
    inline def apply(hit: Double, line: Double): LcovLine = {
      val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LcovLine] (val x: Self) extends AnyVal {
      
      inline def setHit(value: Double): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Code coverage for lines, functions or branches in a file
    */
  trait LcovPart[T] extends StObject {
    
    var details: js.Array[T]
    
    var found: Double
    
    var hit: Double
  }
  object LcovPart {
    
    inline def apply[T](details: js.Array[T], found: Double, hit: Double): LcovPart[T] = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovPart[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LcovPart[?], T] (val x: Self & LcovPart[T]) extends AnyVal {
      
      inline def setDetails(value: js.Array[T]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: T*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setFound(value: Double): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setHit(value: Double): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    }
  }
}
