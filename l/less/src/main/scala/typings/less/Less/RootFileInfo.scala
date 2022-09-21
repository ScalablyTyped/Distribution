package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/less/less.js/blob/master/lib/less/import-manager.js#L10
trait RootFileInfo extends StObject {
  
  /** path to the current file, absolute */
  var currentDirectory: String
  
  /** absolute path to the entry file */
  var entryPath: String
  
  /** full resolved filename of current file */
  var filename: String
  
  /** whether the file should not be output and only output parts that are referenced */
  var reference: Boolean
  
  var relativeUrls: Boolean
  
  /** whether to adjust URL's to be relative */
  var rewriteUrls: js.UndefOr[Boolean] = js.undefined
  
  /** filename of the base file */
  var rootFilename: String
  
  /** path to append to normal URLs for this node */
  var rootpath: String
}
object RootFileInfo {
  
  inline def apply(
    currentDirectory: String,
    entryPath: String,
    filename: String,
    reference: Boolean,
    relativeUrls: Boolean,
    rootFilename: String,
    rootpath: String
  ): RootFileInfo = {
    val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relativeUrls = relativeUrls.asInstanceOf[js.Any], rootFilename = rootFilename.asInstanceOf[js.Any], rootpath = rootpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootFileInfo]
  }
  
  extension [Self <: RootFileInfo](x: Self) {
    
    inline def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Boolean): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRelativeUrls(value: Boolean): Self = StObject.set(x, "relativeUrls", value.asInstanceOf[js.Any])
    
    inline def setRewriteUrls(value: Boolean): Self = StObject.set(x, "rewriteUrls", value.asInstanceOf[js.Any])
    
    inline def setRewriteUrlsUndefined: Self = StObject.set(x, "rewriteUrls", js.undefined)
    
    inline def setRootFilename(value: String): Self = StObject.set(x, "rootFilename", value.asInstanceOf[js.Any])
    
    inline def setRootpath(value: String): Self = StObject.set(x, "rootpath", value.asInstanceOf[js.Any])
  }
}
