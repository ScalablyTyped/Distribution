package typings.jsonFilePlus

import typings.jsonFilePlus.jsonFilePlusStrings.Charactertabulation
import typings.jsonFilePlus.jsonFilePlusStrings.Space
import typings.node.bufferMod.global.Buffer
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Read from and write to JSON files, without losing formatting, to minimize diffs.
    *
    * @example
    * import jsonFile = require('json-file-plus');
    * import * as path from 'node:path'
    *
    * const filename = path.join(process.cwd(), 'package.json');
    * const callback = (err: Error | null, result?: unknown) => {
    *     // your code here
    * };
    *
    * jsonFile(filename, (err, file) => {
    *     if (err) { return doSomethingWithError(err); }
    *
    *     file.data; // Direct access to the data from the file
    *     file.format; // extracted formatting data. change at will.
    *
    *     file.get('version'); // get top-level keys
    *     file.get('version', callback); // get top-level key
    *     file.get(); // get entire data
    *     file.get(callback); // get entire data
    *
    *     // pass any plain object into "set" to merge in a deep copy
    *     // please note: references will be broken.
    *     file.set({
    *         foo: 'bar',
    *         bar: {
    *             baz: true
    *         }
    *     });
    *
    *     file.remove('description'); // remove a specific key-value pair
    *     file.remove('description', callback); // remove a specific key-value pair
    *
    *     // change the filename if desired
    *     file.filename = path.join(process.cwd(), 'new-package.json');
    *
    *     // Save the file, preserving formatting.
    *     file.save(callback)
    *         .then(() => {
    *             console.log('success!');
    *         })
    *         .catch(err => {
    *             console.log('error!', err);
    *         });
    * });
    */
  inline def apply(filename: String): js.Promise[JSONFile] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONFile]]
  inline def apply(filename: String, callback: js.Function2[/* err */ js.Error | Null, /* file */ JSONFile, Unit]): js.Promise[JSONFile] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONFile]]
  
  @JSImport("json-file-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-file-plus", "JSONData")
  @js.native
  open class JSONData protected () extends StObject {
    def this(raw: String) = this()
    
    /**
      * Direct access to the data from the file.
      */
    var data: Any = js.native
    
    /**
      * Extracted formatting data.
      */
    var format: Format = js.native
    
    def get(): js.Promise[Any] = js.native
    def get(callback: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]): js.Promise[Any] = js.native
    /**
      * Get top-level keys.
      *
      * @param key The key to get. If empty, the entire data will be returned.
      */
    def get(key: PropertyKey): js.Promise[Any] = js.native
    def get(key: PropertyKey, callback: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]): js.Promise[Any] = js.native
    
    /**
      * Remove a specific key-value pair.
      */
    def remove(key: String): js.Promise[Unit] = js.native
    def remove(key: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def remove(key: js.Symbol): js.Promise[Unit] = js.native
    def remove(key: js.Symbol, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Pass any plain object into "set" to merge in a deep copy.
      *
      * Please note: references will be broken.
      */
    def set(data: Record[String, Any]): Unit = js.native
    
    def stringify(): Buffer = js.native
  }
  
  @JSImport("json-file-plus", "JSONFile")
  @js.native
  open class JSONFile protected () extends JSONData {
    def this(filename: String, raw: String) = this()
    
    /**
      * The filename. Can be changed.
      */
    var filename: String = js.native
    
    /**
      * Save the file, preserving formatting.
      */
    def save(): js.Promise[Unit] = js.native
    def save(callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Save the file synchronously, preserving formatting.
      */
    def saveSync(): Unit = js.native
  }
  
  /**
    * Read from JSON files synchronously.
    */
  inline def sync(filename: String): JSONFile = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[JSONFile]
  
  trait Format extends StObject {
    
    var indent: Double | Charactertabulation | Space
    
    var trailing: Boolean
  }
  object Format {
    
    inline def apply(indent: Double | Charactertabulation | Space, trailing: Boolean): Format = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setIndent(value: Double | Charactertabulation | Space): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    }
  }
}
