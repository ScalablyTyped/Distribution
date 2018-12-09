organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-dc9d44"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-20fe2d",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-e6bab8",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-cda800",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-2f3371",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-2a79c6",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-39d94c",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-2ad8dd",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-3c8ff8",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-1b647a",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-b18cde",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-1766e8",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-eb8a04",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-510391",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-34050e",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-950e43",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-ed446a",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-b86111",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-c76885",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-643d88",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-ea2de0",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-2ea4b3",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-f6d1ea",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-79eab1",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-6b4daf",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        