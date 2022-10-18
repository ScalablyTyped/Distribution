package typings.hyperformula

import typings.hyperformula.typingsI18nMod.TranslationPackage
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphSheetMappingMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/SheetMapping", "SheetMapping")
  @js.native
  open class SheetMapping protected () extends StObject {
    def this(languages: TranslationPackage) = this()
    
    def addSheet(): Double = js.native
    def addSheet(newSheetDisplayName: String): Double = js.native
    
    def displayNames(): IterableIterator[String] = js.native
    
    def fetch(sheetName: String): Double = js.native
    
    def fetchDisplayName(sheetId: Double): String = js.native
    
    /* private */ var fetchSheetById: Any = js.native
    
    def get(sheetName: String): Maybe[Double] = js.native
    
    def getDisplayName(sheetId: Double): Maybe[String] = js.native
    
    def hasSheetWithId(sheetId: Double): Boolean = js.native
    
    def hasSheetWithName(sheetName: String): Boolean = js.native
    
    /* private */ var languages: Any = js.native
    
    /* private */ var lastSheetId: Any = js.native
    
    /* private */ val mappingFromCanonicalName: Any = js.native
    
    /* private */ val mappingFromId: Any = js.native
    
    def numberOfSheets(): Double = js.native
    
    def removeSheet(sheetId: Double): Unit = js.native
    
    def renameSheet(sheetId: Double, newDisplayName: String): Maybe[String] = js.native
    
    /* private */ val sheetNamePrefix: Any = js.native
    
    def sheetNames(): js.Array[String] = js.native
    
    /* private */ var store: Any = js.native
  }
}
