package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom information type based on a dictionary of words or phrases. This can
  * be used to match sensitive information specific to the data, such as a list
  * of employee IDs or job titles.  Dictionary words are case-insensitive and
  * all characters other than letters and digits in the unicode [Basic
  * Multilingual
  * Plane](https://en.wikipedia.org/wiki/Plane_%28Unicode%29#Basic_Multilingual_Plane)
  * will be replaced with whitespace when scanning for matches, so the
  * dictionary phrase &quot;Sam Johnson&quot; will match all three phrases
  * &quot;sam johnson&quot;, &quot;Sam, Johnson&quot;, and &quot;Sam
  * (Johnson)&quot;. Additionally, the characters surrounding any match must be
  * of a different type than the adjacent characters within the word, so
  * letters must be next to non-letters and digits next to non-digits. For
  * example, the dictionary word &quot;jen&quot; will match the first three
  * letters of the text &quot;jen123&quot; but will return no matches for
  * &quot;jennifer&quot;.  Dictionary words containing a large number of
  * characters that are not letters or digits may result in unexpected findings
  * because such characters are treated as whitespace. The
  * [limits](https://cloud.google.com/dlp/limits) page contains details about
  * the size limits of dictionaries. For dictionaries that do not fit within
  * these constraints, consider using `LargeCustomDictionaryConfig` in the
  * `StoredInfoType` API.
  */
trait SchemaGooglePrivacyDlpV2Dictionary extends StObject {
  
  /**
    * Newline-delimited file of words in Cloud Storage. Only a single file is
    * accepted.
    */
  var cloudStoragePath: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStoragePath] = js.undefined
  
  /**
    * List of words or phrases to search for.
    */
  var wordList: js.UndefOr[SchemaGooglePrivacyDlpV2WordList] = js.undefined
}
object SchemaGooglePrivacyDlpV2Dictionary {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Dictionary]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Dictionary](x: Self) {
    
    inline def setCloudStoragePath(value: SchemaGooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "cloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setCloudStoragePathUndefined: Self = StObject.set(x, "cloudStoragePath", js.undefined)
    
    inline def setWordList(value: SchemaGooglePrivacyDlpV2WordList): Self = StObject.set(x, "wordList", value.asInstanceOf[js.Any])
    
    inline def setWordListUndefined: Self = StObject.set(x, "wordList", js.undefined)
  }
}
