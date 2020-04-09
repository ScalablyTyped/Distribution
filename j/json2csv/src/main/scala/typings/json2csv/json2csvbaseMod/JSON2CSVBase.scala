package typings.json2csv.json2csvbaseMod

import typings.json2csv.json2csvbaseMod.json2csv.FieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.NormalizedFieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2CSVBase[T] extends js.Object {
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
}

