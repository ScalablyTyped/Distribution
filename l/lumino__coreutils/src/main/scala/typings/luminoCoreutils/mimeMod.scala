package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod {
  
  @JSImport("@lumino/coreutils/types/mime", "MimeData")
  @js.native
  class MimeData () extends StObject {
    
    var _types: js.Any = js.native
    
    var _values: js.Any = js.native
    
    /**
      * Remove all data entries from the dataset.
      */
    def clear(): Unit = js.native
    
    /**
      * Remove the data entry for the given MIME type.
      *
      * @param mime - The MIME type of interest.
      *
      * #### Notes
      * This is a no-op if there is no entry for the given MIME type.
      */
    def clearData(mime: String): Unit = js.native
    
    /**
      * Get the data value for the given MIME type.
      *
      * @param mime - The MIME type of interest.
      *
      * @returns The value for the given MIME type, or `undefined` if
      *   the dataset does not contain a value for the type.
      */
    def getData(mime: String): js.UndefOr[js.Any] = js.native
    
    /**
      * Test whether the dataset has an entry for the given type.
      *
      * @param mime - The MIME type of interest.
      *
      * @returns `true` if the dataset contains a value for the given
      *   MIME type, `false` otherwise.
      */
    def hasData(mime: String): Boolean = js.native
    
    /**
      * Set the data value for the given MIME type.
      *
      * @param mime - The MIME type of interest.
      *
      * @param data - The data value for the given MIME type.
      *
      * #### Notes
      * This will overwrite any previous entry for the MIME type.
      */
    def setData(mime: String, data: js.Any): Unit = js.native
    
    /**
      * Get an array of the MIME types contained within the dataset.
      *
      * @returns A new array of the MIME types, in order of insertion.
      */
    def types(): js.Array[String] = js.native
  }
}
