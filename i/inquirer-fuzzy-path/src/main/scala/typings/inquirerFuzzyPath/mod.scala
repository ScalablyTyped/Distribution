package typings.inquirerFuzzyPath

import typings.inquirer.mod.Answers
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
  open class ^[T /* <: Answers */] protected ()
    extends StObject
       with InquirerFuzzyPath[T] {
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
    
    /**
      * When user presses `enter` key
      *
      * @param line
      * The input on the line.
      */
    /* CompleteClass */
    override def onSubmit(line: String): Unit = js.native
    
    /**
      * Curate list of choices.
      *
      * @param searchTerm
      * The term to search for
      */
    /* CompleteClass */
    override def search(searchTerm: String): js.Promise[Unit] = js.native
  }
  
  /**
    * Provides options for a question of type `InquirerFuzzyPath`.
    *
    * @template T
    * The type of the answers.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Omit</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AutocompleteQuestionOptions<T> * / any, 'type'> ]:? std.Omit</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AutocompleteQuestionOptions<T> * / any, 'type'>[P]} */ trait FuzzyPathQuestionOptions[T /* <: Answers */] extends StObject {
    
    /**
      * An integer (>= 0) to limit the depth of sub-folders to scan,
      * undefined means infinite.
      */
    var depthLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * A function to exclude some paths from the final list.
      */
    var excludeFilter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    /**
      * A function to exclude some paths from the file-system scan.
      */
    var excludePath: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    /**
      * A string to specify the type of nodes to display, default to "any".
      */
    var itemType: js.UndefOr[any | directory | file] = js.undefined
    
    /**
      * The key to save the answer to the answers-hash.
      */
    var name: KeyUnion[T]
    
    /**
      * The root search directory, default to ".".
      */
    var rootPath: js.UndefOr[String] = js.undefined
    
    /**
      * The key to save the answer to the answers-hash.
      */
    var `type`: fuzzypath
  }
  object FuzzyPathQuestionOptions {
    
    inline def apply[T /* <: Answers */](name: KeyUnion[T]): FuzzyPathQuestionOptions[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fuzzypath")
      __obj.asInstanceOf[FuzzyPathQuestionOptions[T]]
    }
    
    extension [Self <: FuzzyPathQuestionOptions[?], T /* <: Answers */](x: Self & FuzzyPathQuestionOptions[T]) {
      
      inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      inline def setExcludeFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "excludeFilter", js.Any.fromFunction1(value))
      
      inline def setExcludeFilterUndefined: Self = StObject.set(x, "excludeFilter", js.undefined)
      
      inline def setExcludePath(value: /* path */ String => Boolean): Self = StObject.set(x, "excludePath", js.Any.fromFunction1(value))
      
      inline def setExcludePathUndefined: Self = StObject.set(x, "excludePath", js.undefined)
      
      inline def setItemType(value: any | directory | file): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setName(value: KeyUnion[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
      
      inline def setType(value: fuzzypath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InquirerAutocomplete<T> * / any */ trait InquirerFuzzyPath[T /* <: Answers */] extends StObject {
    
    /**
      * When user presses `enter` key
      *
      * @param line
      * The input on the line.
      */
    def onSubmit(line: String): Unit
    
    /**
      * Curate list of choices.
      *
      * @param searchTerm
      * The term to search for
      */
    def search(searchTerm: String): js.Promise[Unit]
  }
  object InquirerFuzzyPath {
    
    inline def apply[T /* <: Answers */](onSubmit: String => Unit, search: String => js.Promise[Unit]): InquirerFuzzyPath[T] = {
      val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit), search = js.Any.fromFunction1(search))
      __obj.asInstanceOf[InquirerFuzzyPath[T]]
    }
    
    extension [Self <: InquirerFuzzyPath[?], T /* <: Answers */](x: Self & InquirerFuzzyPath[T]) {
      
      inline def setOnSubmit(value: String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setSearch(value: String => js.Promise[Unit]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    }
  }
}
