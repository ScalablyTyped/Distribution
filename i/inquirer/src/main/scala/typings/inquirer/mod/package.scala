package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A set of answers.
    */
  type Answers = typings.std.Record[java.lang.String, js.Any]
  /**
    * Represents a dynamic property for a question which can be fetched asynchronously.
    */
  type AsyncDynamicQuestionProperty[T, TAnswers /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.DynamicQuestionProperty[T | js.Promise[T], TAnswers]
  /**
    * Provides options for a question for the `CheckboxPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type CheckboxQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.ListQuestionOptionsBase[T, typings.inquirer.mod.CheckboxChoiceMap[T]]
  /**
    * Represents a set of choices.
    */
  type ChoiceCollection[T /* <: typings.inquirer.mod.Answers */] = js.Array[
    typings.inquirer.mod.DistinctChoice[typings.inquirer.mod.AllChoiceMap[typings.inquirer.mod.Answers]]
  ]
  /**
    * Provides options for a question for the `ConfirmPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ConfirmQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.Question[T]
  /**
    * Provides valid choices for the question of the `TChoiceMap`.
    *
    * @template TChoiceMap
    * The choice-types to provide.
    */
  type DistinctChoice[TChoiceMap] = java.lang.String | (/* import warning: importer.ImportType#apply Failed type conversion: TChoiceMap[keyof TChoiceMap] */ js.Any)
  /**
    * Represents a dynamic property for a question.
    */
  type DynamicQuestionProperty[T, TAnswers /* <: typings.inquirer.mod.Answers */] = T | (js.Function1[/* answers */ TAnswers, T])
  /**
    * Provides options for a question for the `EditorPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type EditorQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.Question[T]
  /**
    * Provides options for a question for the `ExpandPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ExpandQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.ListQuestionOptionsBase[T, typings.inquirer.mod.ExpandChoiceMap[T]]
  /**
    * Represents either a key of `T` or a `string`.
    *
    * @template T
    * The type of the keys to suggest.
    */
  type KeyUnion[T] = typings.inquirer.mod.LiteralUnion[typings.std.Extract[java.lang.String, java.lang.String], java.lang.String]
  /**
    * Provides options for a question for the `ListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ListQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.ListQuestionOptionsBase[T, typings.inquirer.mod.ListChoiceMap[T]]
  /**
    * Represents a union which preserves autocompletion.
    *
    * @template T
    * The keys which are available for autocompletion.
    *
    * @template F
    * The fallback-type.
    */
  type LiteralUnion[T /* <: F */, F] = T | (F with js.Object)
  /**
    * Provides options for a question for the `NumberPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type NumberQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.InputQuestionOptions[T]
  /**
    * Represents a collection of questions.
    *
    * @template T
    * The type of the answers.
    */
  type QuestionCollection[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.DistinctQuestion[T] | js.Array[typings.inquirer.mod.DistinctQuestion[T]] | typings.rxjs.mod.Observable_[typings.inquirer.mod.DistinctQuestion[T]]
  /**
    * Provides options for a question for the `RawListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type RawListQuestionOptions[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.ListQuestionOptions[T]
  /**
    * Provides the functionality to transform an answer.
    *
    * @template T
    * The type of the answers.
    */
  type Transformer[T /* <: typings.inquirer.mod.Answers */] = js.UndefOr[
    js.Function3[
      /* input */ js.Any, 
      /* answers */ T, 
      /* flags */ typings.inquirer.AnonIsFinal, 
      java.lang.String | js.Promise[java.lang.String]
    ]
  ]
  /**
    * Converts the specified union-type `U` to an intersection-type.
    *
    * @template U
    * The union to convert to an intersection.
    */
  type UnionToIntersection[U] = js.Any
  /**
    * Provides the functionality to validate answers.
    *
    * @template T
    * The type of the answers.
    */
  type Validator[T /* <: typings.inquirer.mod.Answers */] = js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String])
    ]
  ]
}
