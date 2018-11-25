organization := "com.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-de4c79"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180910Z-9b1438",
  "com.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180910Z-a766ae",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "commander" % "2.19.0-507617",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-9d1bfa",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-766b72",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-5d44f9",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4a4834",
  "com.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180910Z-3e672d",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-eae856",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-552e31",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "tslint" % "5.11.0-c9c07d",
  "com.scalablytyped" %%% "tsutils" % "2.29.0-f21c88",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        