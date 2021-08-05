package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  /** Name and version info of used browser. */
  var browser: js.UndefOr[Browser] = js.undefined
  
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Name and version info of the log creator application. */
  var creator: Creator
  
  /** List of all exported (tracked) requests. */
  var entries: js.Array[Entry]
  
  /**
    * List of all exported (tracked) pages.
    *
    * _Leave out this field if the application
    * does not support grouping by pages._
    *
    * There is one `<page>` object for every exported web page and one
    * `<entry>` object for every HTTP request.
    * In case when an HTTP trace tool isn't able to group requests by a page,
    * the `<pages>` object is empty and individual requests doesn't have a
    * parent page.
    */
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  
  /**
    * Version number of the format.
    *
    * _If empty, string "1.1" is assumed by default._
    */
  var version: String
}
object Log {
  
  inline def apply(creator: Creator, entries: js.Array[Entry], version: String): Log = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  extension [Self <: Log](x: Self) {
    
    inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreator(value: Creator): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: Entry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
