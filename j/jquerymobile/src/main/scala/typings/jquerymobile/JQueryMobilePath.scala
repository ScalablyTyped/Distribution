package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMobilePath extends StObject {
  
  def get(url: String): String = js.native
  
  def getDocumentBase(): Any = js.native
  def getDocumentBase(asParsedObject: Boolean): Any = js.native
  
  def getDocumentUrl(): Any = js.native
  def getDocumentUrl(asParsedObject: Boolean): Any = js.native
  
  def getLocation(): String = js.native
  
  def isAbsoluteUrl(url: String): Boolean = js.native
  
  def isRelativeUrl(url: String): Boolean = js.native
  
  def makeUrlAbsolute(relUrl: String, absUrl: String): String = js.native
  
  def parseLocation(): ParsedPath = js.native
  
  def parseUrl(url: String): ParsedPath = js.native
}
