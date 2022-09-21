package typings.inquirerFuzzyPath

import typings.inquirer.mod.Answers
import typings.inquirer.mod.AsyncDynamicQuestionProperty
import typings.inquirer.mod.KeyUnion
import typings.inquirer.mod.QuestionCollection
import typings.inquirerFuzzyPath.inquirerFuzzyPathStrings.any
import typings.inquirerFuzzyPath.inquirerFuzzyPathStrings.directory
import typings.inquirerFuzzyPath.inquirerFuzzyPathStrings.file
import typings.inquirerFuzzyPath.inquirerFuzzyPathStrings.fuzzypath
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  @JSImport("inquirer-fuzzy-path", JSImport.Namespace)
  @js.native
  open class ^[T /* <: Answers */] protected () extends InquirerFuzzyPath[T] {
    /**
      * Create new InquirerFuzzyPath
      *
      * @param questions
      * The questions to prompt
      * @param rl
      * The readline interface
      * @param answers
      * The currently supplied answers
      */
    def this(questions: QuestionCollection[T], rl: Interface, answers: Answers) = this()
  }
  
  /**
    * Provides options for a question of type `InquirerFuzzyPath`.
    *
    * @template T
    * The type of the answers.
    */
  /* Inlined parent std.Partial<std.Omit<inquirer-autocomplete-prompt.inquirer-autocomplete-prompt.AutocompleteQuestionOptions<T>, 'type'>> */
  trait FuzzyPathQuestionOptions[T /* <: Answers */] extends StObject {
    
    var default: js.UndefOr[AsyncDynamicQuestionProperty[Any, T]] = js.undefined
    
    var askAnswered: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An integer (>= 0) to limit the depth of sub-folders to scan,
      * undefined means infinite.
      */
    var depthLimit: js.UndefOr[Double] = js.undefined
    
    var emptyText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to exclude some paths from the final list.
      */
    var excludeFilter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    /**
      * A function to exclude some paths from the file-system scan.
      */
    var excludePath: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* input */ Any, /* answers */ T, Any]] = js.undefined
    
    /**
      * A string to specify the type of nodes to display, default to "any".
      */
    var itemType: js.UndefOr[any | directory | file] = js.undefined
    
    var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.undefined
    
    /**
      * The key to save the answer to the answers-hash.
      */
    var name: KeyUnion[T]
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The root search directory, default to ".".
      */
    var rootPath: js.UndefOr[String] = js.undefined
    
    var searchText: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[js.Function1[/* answersSoFar */ T, js.Promise[js.Array[Any]]]] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var suggestOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key to save the answer to the answers-hash.
      */
    var `type`: fuzzypath
    
    var validate: js.UndefOr[
        js.Function2[
          /* input */ Any, 
          /* answers */ js.UndefOr[T], 
          Boolean | String | (js.Promise[Boolean | String])
        ]
      ] = js.undefined
    
    var when: js.UndefOr[AsyncDynamicQuestionProperty[Boolean, T]] = js.undefined
  }
  object FuzzyPathQuestionOptions {
    
    inline def apply[T /* <: Answers */](name: KeyUnion[T]): FuzzyPathQuestionOptions[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fuzzypath")
      __obj.asInstanceOf[FuzzyPathQuestionOptions[T]]
    }
    
    extension [Self <: FuzzyPathQuestionOptions[?], T /* <: Answers */](x: Self & FuzzyPathQuestionOptions[T]) {
      
      inline def setAskAnswered(value: Boolean): Self = StObject.set(x, "askAnswered", value.asInstanceOf[js.Any])
      
      inline def setAskAnsweredUndefined: Self = StObject.set(x, "askAnswered", js.undefined)
      
      inline def setDefault(value: AsyncDynamicQuestionProperty[Any, T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: T => Any | js.Promise[Any]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      inline def setEmptyText(value: Boolean): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setExcludeFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "excludeFilter", js.Any.fromFunction1(value))
      
      inline def setExcludeFilterUndefined: Self = StObject.set(x, "excludeFilter", js.undefined)
      
      inline def setExcludePath(value: /* path */ String => Boolean): Self = StObject.set(x, "excludePath", js.Any.fromFunction1(value))
      
      inline def setExcludePathUndefined: Self = StObject.set(x, "excludePath", js.undefined)
      
      inline def setFilter(value: (/* input */ Any, /* answers */ T) => Any): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setItemType(value: any | directory | file): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setMessage(value: AsyncDynamicQuestionProperty[String, T]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: T => String | js.Promise[String]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: KeyUnion[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
      
      inline def setSearchText(value: Boolean): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
      
      inline def setSource(value: /* answersSoFar */ T => js.Promise[js.Array[Any]]): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuggestOnly(value: Boolean): Self = StObject.set(x, "suggestOnly", value.asInstanceOf[js.Any])
      
      inline def setSuggestOnlyUndefined: Self = StObject.set(x, "suggestOnly", js.undefined)
      
      inline def setType(value: fuzzypath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(
        value: (/* input */ Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String])
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setWhen(value: AsyncDynamicQuestionProperty[Boolean, T]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenFunction1(value: T => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  @js.native
  trait InquirerFuzzyPath[T /* <: Answers */]
    extends typings.inquirerAutocompletePrompt.mod.^[T]
}
