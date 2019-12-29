package typings.atJupyterlabDocumentsearch.libInterfacesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayState extends js.Object {
  /**
    * Should the search be case sensitive?
    */
  var caseSensitive: Boolean
  /**
    * The index of the currently selected match
    */
  var currentIndex: Double
  /**
    * An error message (used for bad regex syntax)
    */
  var errorMessage: String
  /**
    * Should the focus forced into the input on the next render?
    */
  var forceFocus: Boolean
  /**
    * The query constructed from the text and the case/regex flags
    */
  var query: RegExp
  /**
    * Whether or not the replace entry row is visible
    */
  var replaceEntryShown: Boolean
  /**
    * Whether or not the replace input is currently focused
    */
  var replaceInputFocused: Boolean
  /**
    * The text in the replace entry
    */
  var replaceText: String
  /**
    * Whether or not the search input is currently focused
    */
  var searchInputFocused: Boolean
  /**
    * The text in the search entry
    */
  var searchText: String
  /**
    * The total number of matches found in the document
    */
  var totalMatches: Double
  /**
    * Should the search string be treated as a RegExp?
    */
  var useRegex: Boolean
}

object IDisplayState {
  @scala.inline
  def apply(
    caseSensitive: Boolean,
    currentIndex: Double,
    errorMessage: String,
    forceFocus: Boolean,
    query: RegExp,
    replaceEntryShown: Boolean,
    replaceInputFocused: Boolean,
    replaceText: String,
    searchInputFocused: Boolean,
    searchText: String,
    totalMatches: Double,
    useRegex: Boolean
  ): IDisplayState = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], forceFocus = forceFocus.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], replaceEntryShown = replaceEntryShown.asInstanceOf[js.Any], replaceInputFocused = replaceInputFocused.asInstanceOf[js.Any], replaceText = replaceText.asInstanceOf[js.Any], searchInputFocused = searchInputFocused.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], totalMatches = totalMatches.asInstanceOf[js.Any], useRegex = useRegex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDisplayState]
  }
}

