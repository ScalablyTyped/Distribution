package typings.jbinary

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Class for working with binary data.
    */
  @JSImport("jbinary", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with jBinary {
    /**
      * Creates a new jBinary instance with an empty buffer as data.
      * @param bufferSize The size of the empty buffer in bytes.
      * @param typeSet Typeset object with all the defined types.
      */
    def this(bufferSize: Double) = this()
    /**
      * Creates a new jBinary instance with the provided binary string as data.
      * @param data The binary data as a string.
      * @param typeSet Typeset object with all the defined types.
      */
    def this(data: String) = this()
    /**
      * Creates a new jBinary instance with the provided array as data.
      * @param data The binary data as a numeric array.
      * @param typeSet Typeset object with all the defined types.
      */
    def this(data: js.Array[Double]) = this()
    /**
      * Creates a new jBinary instance with a jDataView object as data.
      * @param data The binary data in a jDataView object.
      * @param typeSet Typeset object with all the defined types.
      */
    def this(data: typings.jdataview.mod.^) = this()
    def this(bufferSize: Double, typeSet: TypeSet) = this()
    def this(data: String, typeSet: TypeSet) = this()
    def this(data: js.Array[Double], typeSet: TypeSet) = this()
    def this(data: typings.jdataview.mod.^, typeSet: TypeSet) = this()
  }
  @JSImport("jbinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a custom type based on another type to be used within Typesets.
    * @param config The config of the custom type.
    */
  /* static member */
  inline def Template(config: CustomTypeConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Template")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Creates a custom type to be used within Typesets.
    * @param config The config of the custom type.
    */
  /* static member */
  inline def Type(config: CustomTypeConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Loads data from a given source and calls a callback with the jBinary object.
    * @param source Source of the data to be loaded.
    * @param typeSet Typeset to use for loading the data.
    * @param callback Function called when the data is loaded or loading the data fails.
    */
  /* static member */
  inline def load(source: SourceType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def load(
    source: SourceType,
    typeSet: Unit,
    callback: js.Function2[/* error */ js.Error | Null, /* jb */ jBinary, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(source: SourceType, typeSet: TypeSet): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(
    source: SourceType,
    typeSet: TypeSet,
    callback: js.Function2[/* error */ js.Error | Null, /* jb */ jBinary, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Loads data from a given source and returns it in a promise.
    * @param source Source of the data to be loaded.
    * @returns Promise with the loaded data as parameter.
    */
  /* static member */
  inline def loadData(source: SourceType): js.Promise[DataType] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataType]]
  /**
    * Loads data from a given source and returns it in a callback.
    * @param source Source of the data to be loaded.
    * @param callback Function called when the data is loaded or loading the data fails.
    */
  /* static member */
  inline def loadData(
    source: SourceType,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ js.UndefOr[DataType], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Loads data from a given source and returns a promise with the jBinary object.
    * @param source Source of the data to be loaded.
    * @param typeSet Typeset to use for loading the data.
    * @returns Promise with the jBinary object as parameter.
    */
  /* static member */
  inline def load_Promise(source: SourceType): js.Promise[jBinary] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[jBinary]]
  inline def load_Promise(source: SourceType, typeSet: TypeSet): js.Promise[jBinary] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any])).asInstanceOf[js.Promise[jBinary]]
  
  /**
    * Type for configuring user defined custom types.
    * @see https://github.com/jDataView/jBinary/wiki/jBinary.Type
    * @see https://github.com/jDataView/jBinary/wiki/jBinary.Template
    */
  trait CustomTypeConfig extends StObject {
    
    var params: js.UndefOr[js.Array[String]] = js.undefined
    
    def read(context: Any): Any
    
    var resolve: js.UndefOr[
        js.ThisFunction1[/* this */ Any, /* getType */ js.Function1[/* repeated */ Any, Any], Unit]
      ] = js.undefined
    
    var setParams: js.UndefOr[js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit]] = js.undefined
    
    var typeParams: js.UndefOr[js.Array[String]] = js.undefined
    
    def write(data: Any, context: Any): Unit
  }
  object CustomTypeConfig {
    
    inline def apply(read: Any => Any, write: (Any, Any) => Unit): CustomTypeConfig = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[CustomTypeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomTypeConfig] (val x: Self) extends AnyVal {
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setRead(value: Any => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setResolve(value: js.ThisFunction1[/* this */ Any, /* getType */ js.Function1[/* repeated */ Any, Any], Unit]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSetParams(value: js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit]): Self = StObject.set(x, "setParams", value.asInstanceOf[js.Any])
      
      inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
      
      inline def setTypeParams(value: js.Array[String]): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
      
      inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
      
      inline def setTypeParamsVarargs(value: String*): Self = StObject.set(x, "typeParams", js.Array(value*))
      
      inline def setWrite(value: (Any, Any) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Possible types for the data.
    */
  type DataType = String | Buffer
  
  /**
    * Defines how to read and write certain types of data.
    * @see https://github.com/jDataView/jBinary/wiki/Typesets
    */
  type DataTypeSet = StringDictionary[Any]
  
  /**
    * Possible destination types for saving binary data.
    */
  type DestinationType = String | Writable
  
  /**
    * Possible source types for loading binary data.
    */
  type SourceType = String | Readable | File
  
  /**
    * Defines some global options and how to read and write certain types of data.
    * @see https://github.com/jDataView/jBinary/wiki/Typesets
    */
  trait TypeSet
    extends StObject
       with DataTypeSet {
    
    @JSName("jBinary.all")
    var jBinaryDotall: js.UndefOr[String] = js.undefined
    
    @JSName("jBinary.littleEndian")
    var jBinaryDotlittleEndian: js.UndefOr[Boolean] = js.undefined
    
    @JSName("jBinary.mimeType")
    var jBinaryDotmimeType: js.UndefOr[String] = js.undefined
  }
  object TypeSet {
    
    inline def apply(): TypeSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeSet] (val x: Self) extends AnyVal {
      
      inline def setJBinaryDotall(value: String): Self = StObject.set(x, "jBinary.all", value.asInstanceOf[js.Any])
      
      inline def setJBinaryDotallUndefined: Self = StObject.set(x, "jBinary.all", js.undefined)
      
      inline def setJBinaryDotlittleEndian(value: Boolean): Self = StObject.set(x, "jBinary.littleEndian", value.asInstanceOf[js.Any])
      
      inline def setJBinaryDotlittleEndianUndefined: Self = StObject.set(x, "jBinary.littleEndian", js.undefined)
      
      inline def setJBinaryDotmimeType(value: String): Self = StObject.set(x, "jBinary.mimeType", value.asInstanceOf[js.Any])
      
      inline def setJBinaryDotmimeTypeUndefined: Self = StObject.set(x, "jBinary.mimeType", js.undefined)
    }
  }
  
  /**
    * Class for working with binary data.
    */
  @js.native
  trait jBinary extends StObject {
    
    /**
      * Casts a jBinary instance to the given Typeset while pointing to the
      * same data, pointers and methods as the original instance.
      * @param typeSet The new Typeset for the resulting instance.
      * @param modifyOriginal If true, the original instance will be modified instead of being inherited.
      */
    def as(typeSet: TypeSet): jBinary = js.native
    def as(typeSet: TypeSet, modifyOriginal: Boolean): jBinary = js.native
    
    /**
      * Reads a value of a specified type.
      * @param type The name of the type to read. (eg: "uint8", "uint32", ["array", "uint8", 4] etc.)
      * @param offset If provided, read from this offset position, otherwise read from the current position
      *               and move data pointer forward (streaming mode).
      * @returns The read value.
      */
    def read(`type`: String): Any = js.native
    def read(`type`: String, offset: Double): Any = js.native
    def read(`type`: js.Tuple3[String, String, js.UndefOr[Double]]): Any = js.native
    def read(`type`: js.Tuple3[String, String, js.UndefOr[Double]], offset: Double): Any = js.native
    
    /**
      * Reads the entire data as one value of the type specified by the "jBinary.all" key in the Typeset.
      * @returns The read data.
      */
    def readAll(): Any = js.native
    
    /**
      * Saves binary data to a given destination and calls a callback when finished.
      * @param destination Destination of the binary data to be saved.
      * @param mimeType MIME-Type of the data. @default "application/octet-stream"
      * @param callback Function called when data is saved.
      */
    def saveAs(destination: DestinationType): Unit = js.native
    def saveAs(destination: DestinationType, mimeType: String): Unit = js.native
    def saveAs(
      destination: DestinationType,
      mimeType: String,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def saveAs(
      destination: DestinationType,
      mimeType: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    /**
      * Saves binary data to a given destination and returns a promise.
      * @param destination Destination of the binary data to be saved.
      * @param mimeType MIME-Type of the data. @default "application/octet-stream"
      * @returns Promise (with no data) that is fulfilled when the saving was successful.
      */
    @JSName("saveAs")
    def saveAs_Promise(destination: DestinationType): js.Promise[Unit] = js.native
    @JSName("saveAs")
    def saveAs_Promise(destination: DestinationType, mimeType: String): js.Promise[Unit] = js.native
    
    /**
      * Go to "position" in the binary data, execute the given callback and return to the previous position.
      * @param position Byte position to seek to in the binary data.
      * @param callback Callback to execute at the new position.
      * @returns The value returned by the callback.
      */
    def seek(position: Double): Any = js.native
    def seek(position: Double, callback: js.Function0[Any]): Any = js.native
    /**
      * Go to "position" in the binary data.
      * @param position Byte position to seek to in the binary data.
      */
    @JSName("seek")
    def seek_Unit(position: Double): Unit = js.native
    
    /**
      * Advance in the binary data by "count" bytes.
      * @param count Number of bytes to advance in the binary data.
      */
    def skip(count: Double): Unit = js.native
    /**
      * Advance in the binary data by "count" bytes, execute the given callback and return to the previous position.
      * @param count Number of bytes to advance in the binary data.
      * @param callback Callback to execute at the new position.
      * @returns The value returned by the callback.
      */
    def skip(count: Double, callback: js.Function0[Any]): Any = js.native
    
    /**
      * Returns a sliced version of the current binary with same Typeset.
      * @param start Slice start position. (0-based index for the first index to include in the slice)
      * @param end Slice end position. (0-based index for the last index to include in the slice)
      * @param forceCopy If true, a new jDataView will be created and the original data is not linked to it.
      *                  Changes will therefore be isolated from the original binary.
      */
    def slice(start: Double, end: Double): jBinary = js.native
    def slice(start: Double, end: Double, forceCopy: Boolean): jBinary = js.native
    
    /**
      * Returns the current position in the binary data.
      * @returns The current position in the binary data.
      */
    def tell(): Double = js.native
    
    /**
      * Returns a URI suitable for usage in DOM elements.
      * @param mimeType MIME-Type of the data. @default "application/octet-stream"
      * @returns Blob URIs where supported, data-URIs in other cases.
      */
    def toURI(): String = js.native
    def toURI(mimeType: String): String = js.native
    
    /**
      * Property for accessing the encapulated data view.
      */
    var view: typings.jdataview.mod.^ = js.native
    
    /**
      * Writes a value of a specified type into the binary data.
      * @param type The name of the type to write. (eg: "uint8", "uint32", ["array", "uint8", 4] etc.)
      * @param data The value to write.
      * @param offset If provided, write to this offset position, otherwise write it to the current position
      *               and move data pointer forward (streaming mode).
      */
    def write(`type`: String, data: Any): Unit = js.native
    def write(`type`: String, data: Any, offset: Double): Unit = js.native
    def write(`type`: js.Tuple3[String, String, js.UndefOr[Double]], data: Any): Unit = js.native
    def write(`type`: js.Tuple3[String, String, js.UndefOr[Double]], data: Any, offset: Double): Unit = js.native
    
    /**
      * Writes the given data as one value of the type specified by the "jBinary.all" key in the Typeset
      * into the binary data.
      * @param data The value to write.
      */
    def writeAll(data: Any): Unit = js.native
  }
}
