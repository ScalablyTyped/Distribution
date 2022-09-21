package typings.jsonSchemaMdDoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-schema-md-doc", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSONSchemaMarkdown
  @JSImport("json-schema-md-doc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shorthand method to generate markdown from JSON Schema.
    * This is not the preferred method as errors will be more difficult to expose.
    *
    * @param schema JS object or JSON string.
    * @returns generated markdown
    */
  /* static member */
  inline def doc(schema: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("doc")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait JSONSchemaMarkdown extends StObject {
    
    /**
      * Check if value is empty
      *
      * @param value
      * @returns
      *
      */
    def empty(value: Any): Boolean = js.native
    
    /**
      * Append error to errors array
      *
      * @param error Error message
      *
      */
    def error(error: String): Unit = js.native
    
    /**
      * Array of errors during load or markdown generation.
      */
    var errors: js.Array[String] = js.native
    
    /**
      * Escape string for MD link
      *
      * @param value
      */
    def escapeLink(value: String): String = js.native
    
    /**
      * Text to be included in the documentation's footer.
      * Defaults to optional module attribution.
      */
    var footer: String = js.native
    
    /**
      * Process loaded schema and generate the markdown
      *
      * @returns
      */
    def generate(): String = js.native
    
    /**
      * This is the primary method that traverses the schema.
      * The method is strictly structural and should not need to be modified for customization.
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def generateChildren(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /*
      * Below are utility methods.
      */
    /**
      * Handles finding correct method for different schema types.
      *
      * @param type The schema type/
      * @returns
      */
    def getTypeMethod(`type`: String): js.Function4[/* name */ String, /* data */ Any, /* level */ Double, /* path */ String, Unit] = js.native
    
    /**
      * Writes indentation at the given level.
      *
      * @param level Indentation level
      * @param indentChar Character to use for indentation. Defaults to this.indentChar
      * @param listChar Character to use for list
      *
      */
    def indent(level: Double): Unit = js.native
    def indent(level: Double, indentChar: String): Unit = js.native
    def indent(level: Double, indentChar: String, listChar: String): Unit = js.native
    def indent(level: Double, indentChar: Unit, listChar: String): Unit = js.native
    
    /**
      * The character(s) used for indenting the markdown.
      */
    var indentChar: String = js.native
    
    /**
      * Load the schema
      *
      * @param schema JS object or JSON string.
      * @returns
      */
    def load(schema: Any): JSONSchemaMarkdown = js.native
    
    /**
      * Resulting markdown
      */
    var markdown: String = js.native
    
    /**
      * Check if value is NOT empty
      *
      * @param value
      * @returns
      *
      */
    def notEmpty(value: Any): Boolean = js.native
    
    /**
      * The character(s) used for object notation.
      */
    var objectNotation: String = js.native
    
    /**
      * The character(s) used for dividing path elements.
      */
    var pathDivider: String = js.native
    
    /**
      * Write array as markdown list
      *
      * @param list Mixed array to list
      * @param level Indentation level
      *
      */
    def publicwriteList(list: js.Array[Any]): Unit = js.native
    def publicwriteList(list: js.Array[Any], level: Double): Unit = js.native
    
    /**
      * Write notation for inclusive minimum and maximum.
      *
      * @param min Inclusive minimum
      * @param max Inclusive maximum
      *
      */
    def publicwriteMinMax(min: Double, max: Double): Unit = js.native
    
    /**
      * Prepare $ref as a link.
      *
      * @param ref The schema $ref
      * @returns
      */
    def refLink(ref: String): String = js.native
    
    /**
      * Object containing the schema
      */
    var schema: Any = js.native
    
    /**
      * Make a string into a slug string.
      *
      * @param string
      * @returns
      */
    def slugify(string: String): String = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeArray(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeBoolean(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      * This is the shared template for all other types.
      * You may want to override this method to change the order of information in your documentation.
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeGeneric(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeNull(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeNumber(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeObject(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeString(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      * This method is a catch for schema types that aren't recognized.
      * You may want to treat anything resolving to this method as an error.
      *
      * @param name The JSON property name
      * @param data The JS data for the schema
      * @param level Indentation level
      * @param path String describing the path of the property
      */
    def typeUnknown(name: String, data: Any, level: Double, path: String): Unit = js.native
    
    /**
      * Converts boolean to string "true" or "false"
      *
      * @param bool
      * @returns
      *
      */
    def valueBool(bool: Boolean): String = js.native
    
    /**
      * Convert mixed values into markdown notation.
      *
      * @param value
      * @returns
      *
      */
    def valueFormat(value: Any): String = js.native
    
    /**
      * Markdown writing methods
      */
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/array.html#tuple-validation
      * @param bool
      * @param level Indentation level
      */
    def writeAdditionalItems(bool: Boolean, level: Double): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/object.html#property-names
      * @param bool
      * @param level Indentation level
      *
      */
    def writeAdditionalProperties(bool: Boolean, level: Double): Unit = js.native
    
    /**
      * Format and write the schema's $comment
      *
      * @see https://json-schema.org/understanding-json-schema/reference/generic.html#comments
      * @param comment The comment
      * @param level Indentation level
      *
      */
    def writeComment(comment: String, level: Double): Unit = js.native
    
    /**
      * Format and write the *.description
      *
      * @see https://json-schema.org/understanding-json-schema/reference/generic.html
      * @param value The default value
      * @param level Indentation level
      *
      */
    def writeDefault(value: Any, level: Double): Unit = js.native
    
    /**
      * Format and write the *.description
      *
      * @see https://json-schema.org/understanding-json-schema/reference/generic.html
      * @param description The description may include markdown
      * @param level Indentation level
      *
      */
    def writeDescription(description: String, level: Double): Unit = js.native
    
    /**
      * Write *.enum as a list.
      *
      * @param list Enumerated values
      * @param level Indentation level
      *
      */
    def writeEnum(list: js.Array[Any], level: Double): Unit = js.native
    
    /**
      * Write *.examples as a list
      *
      * @see https://json-schema.org/understanding-json-schema/reference/generic.html
      * @param list Examples
      * @param level Indentation level
      *
      */
    def writeExamples(list: js.Array[Any], level: Double): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/string.html#format
      * @param format Format of string
      * @param level Indentation level
      *
      */
    def writeFormat(format: String, level: Double): Unit = js.native
    
    /**
      * @param header The header to be written
      * @param level Header level [H1, H2, H3, H4, H5]
      *
      */
    def writeHeader(header: String): Unit = js.native
    def writeHeader(header: String, level: Double): Unit = js.native
    
    /**
      * Write the $id for reference purposes
      *
      * @see https://json-schema.org/understanding-json-schema/structuring.html#the-id-property
      * @param id the schema's $id
      * @param level Indentation level
      *
      */
    def writeId(id: String, level: Double): Unit = js.native
    
    /**
      * Utility method for writing line to the markdown.
      * Handles line break logic.
      *
      * @param text
      * @param level Indentation level
      *
      */
    def writeLine(): Unit = js.native
    def writeLine(text: String): Unit = js.native
    def writeLine(text: String, level: Double): Unit = js.native
    def writeLine(text: Unit, level: Double): Unit = js.native
    
    /**
      * Write notation for exclusive minimum and maximum.
      *
      * @param min Exclusive minimum
      * @param max Exclusive maximum
      *
      */
    def writeMinMaxExclusive(min: Double, max: Double): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/numeric.html#multiples
      * @param number Regular Expression that string must match.
      * @param level Indentation level
      *
      */
    def writeMultipleOf(number: Double, level: Double): Unit = js.native
    
    /**
      * Writes the path for reference purposes
      *
      * @param level Indentation level
      * @param path String describing the path of the property
      *
      */
    def writePath(level: Double, path: String): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/string.html#regular-expressions
      * @param pattern Regular Expression that string must match.
      * @param level Indentation level
      *
      */
    def writePattern(pattern: String, level: Double): Unit = js.native
    
    /**
      * @param prop Property name
      * @param level Indentation level
      * @param path String describing the path of the property
      * @param required Property is required (True or False [default])
      *
      */
    def writePropertyName(prop: String, level: Double, path: String): Unit = js.native
    def writePropertyName(prop: String, level: Double, path: String, required: Boolean): Unit = js.native
    
    /**
      * Writes the features of object.propertyNames
      *
      * @see https://json-schema.org/understanding-json-schema/reference/object.html#property-names
      * @param data Schema object
      * @param level Indentation level
      *
      */
    def writePropertyNames(data: String, level: Double): Unit = js.native
    
    /**
      * Writes a link to the referenced schema
      *
      * @see https://json-schema.org/understanding-json-schema/structuring.html#reuse
      * @param ref $ID, path, or URI
      * @param level Indentation level
      *
      */
    def writeRef(ref: String, level: Double): Unit = js.native
    
    /**
      * Writes the declared schema URI
      *
      * @see https://json-schema.org/understanding-json-schema/basics.html#declaring-a-json-schema
      * @param uri
      * @param level Indentation level
      *
      */
    def writeSchema(uri: String, level: Double): Unit = js.native
    
    /**
      * Writes a section name
      *
      * @param name
      * @param level Indentation level
      *
      */
    def writeSectionName(name: String): Unit = js.native
    def writeSectionName(name: String, level: Double): Unit = js.native
    
    /**
      * Writes a definition term
      *
      * @param term
      * @param level Indentation level
      *
      */
    def writeTerm(term: String, level: Double): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/basics.html#the-type-keyword
      * @param type
      * @param level Indentation level
      *
      */
    def writeType(`type`: String, level: Double): Unit = js.native
    
    /**
      * @see https://json-schema.org/understanding-json-schema/reference/array.html#uniqueness
      * @param bool
      * @param level Indentation level
      *
      */
    def writeUniqueItems(bool: Boolean, level: Double): Unit = js.native
  }
}
