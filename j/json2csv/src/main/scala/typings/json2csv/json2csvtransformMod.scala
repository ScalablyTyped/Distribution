package typings.json2csv

import typings.json2csv.json2csvbaseMod.json2csv.FieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.NormalizedFieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.Options
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVTransform", JSImport.Namespace)
@js.native
object json2csvtransformMod extends js.Object {
  @js.native
  trait JSON2CSVTransform[T] extends Transform {
    /**
      * Create the title row with all the provided fields as column headings
      *
      * @returns {string} titles as a string
      */
    /* protected */ def getHeader(): String = js.native
    /**
      * Check and normalize the fields configuration.
      *
      * @param {(string|json2csv.FieldInfo)[]} fields Fields configuration provided by the user
      * or inferred from the data
      * @returns {json2csv.NormalizedFieldInfo} preprocessed FieldsInfo array
      */
    def preprocessFieldsInfo[T](fields: js.Array[String | FieldInfo[T]]): js.Array[NormalizedFieldInfo[T]] = js.native
    /*******************************************************************************
      * Everything below is copy-pasted from JSON2CSVBase and should be keep in sync *
      ********************************************************************************/
    /**
      * Check passing opts and set defaults.
      *
      * @param {json2csv.Options} opts Options object containing fields,
      * delimiter, default value, quote mark, header, etc.
      * @returns {json2csv.Options} preprocessed Options object
      */
    /* protected */ def preprocessOpts(): Options[T] = js.native
    /* protected */ def preprocessOpts(opts: Options[T]): Options[T] = js.native
    /**
      * Preprocess each object according to the give opts (unwind, flatten, etc.).
      *
      * @param {object} row JSON object to be converted in a CSV row
      */
    /* protected */ def preprocessRow(row: T): js.Object = js.native
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param {object} row JSON object representing the  CSV row that the cell belongs to
      * @param {object} fieldInfo Details of the field to process to be a CSV cell
      * @returns {string} CSV string (cell)
      */
    /* protected */ def processCell(row: T, fieldInfo: NormalizedFieldInfo[T]): String = js.native
    /**
      * Create the content of a specific CSV row
      *
      * @param {object} row JSON object to be converted in a CSV row
      * @returns {string} CSV string (row)
      */
    /* protected */ def processRow(row: T): String = js.native
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param {any} value Value to be included in a CSV cell
      * @returns {string} Value stringified and processed
      */
    /* protected */ def processValue(value: js.Any): String = js.native
    /**
      * Transforms an incoming json data to csv and pushes it downstream.
      *
      * @param {object} data JSON object to be converted in a CSV row
      */
    /* protected */ def pushLine(data: T): Unit = js.native
  }
  
  @js.native
  // implements JSON2CSVBase<T>
  class default[T] () extends JSON2CSVTransform[T] {
    def this(opts: Options[T]) = this()
    def this(opts: js.UndefOr[scala.Nothing], transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
}

