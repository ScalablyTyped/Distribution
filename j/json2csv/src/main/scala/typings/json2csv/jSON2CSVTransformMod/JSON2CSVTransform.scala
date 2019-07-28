package typings.json2csv.jSON2CSVTransformMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.FieldInfo
import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2CSVTransform[T] extends Transform {
  /**
    * Performs the flattening of a data row recursively
    *
    * @param {object} dataRow Original JSON object
    * @param {string} separator Separator to be used as the flattened field name
    * @returns {object} Flattened object
    */
  /* protected */ def flatten(dataRow: T, separator: String): js.Object = js.native
  /**
    * Create the title row with all the provided fields as column headings
    *
    * @returns {string} titles as a string
    */
  /* protected */ def getHeader(): String = js.native
  /**
    * Create the content of a specfic CSV row cell
    *
    * @param {object} row JSON object representing the  CSV row that the cell belongs to
    * @param {json2csv.FieldInfo} fieldInfo Details of the field to process to be a CSV cell
    * @returns {any} Field value
    */
  /* protected */ def getValue(row: T, fieldInfo: FieldInfo[T]): js.Any = js.native
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
  /* protected */ def processCell(row: T, fieldInfo: FieldInfo[T]): String = js.native
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
    * @param {Boolean} stringify Details of the field to process to be a CSV cell
    * @returns {string} Value stringified and processed
    */
  /* protected */ def processValue(value: js.Any, stringify: Boolean): String = js.native
  /**
    * Transforms an incoming json data to csv and pushes it downstream.
    *
    * @param {object} data JSON object to be converted in a CSV row
    */
  /* protected */ def pushLine(data: T): Unit = js.native
  /**
    * Performs the unwind recursively in specified sequence
    *
    * @param {object[]} dataRow Original JSON object
    * @param {string[]} unwindPaths The paths as strings to be used to deconstruct the array
    * @returns {Array} Array of objects containing all rows after unwind of chosen paths
    */
  /* protected */ def unwindData(dataRow: js.Array[T], unwindPaths: js.Array[String]): js.Array[js.Object] = js.native
}

