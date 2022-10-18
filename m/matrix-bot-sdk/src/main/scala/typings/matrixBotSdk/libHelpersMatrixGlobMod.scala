package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMatrixGlobMod {
  
  @JSImport("matrix-bot-sdk/lib/helpers/MatrixGlob", "MatrixGlob")
  @js.native
  open class MatrixGlob protected () extends StObject {
    /**
      * Creates a new Matrix Glob
      * @param {string} glob The glob to convert. Eg: "*.example.org"
      */
    def this(glob: String) = this()
    
    /**
      * The regular expression which represents this glob.
      */
    val regex: js.RegExp = js.native
    
    /**
      * Tests the glob against a value, returning true if it matches.
      * @param {string} val The value to test.
      * @returns {boolean} True if the value matches the glob, false otherwise.
      */
    def test(`val`: String): Boolean = js.native
  }
}
