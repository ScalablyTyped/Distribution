organization := "com.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180910Z-e27eb1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180910Z-01ea19",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-2613c9",
  "com.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180910Z-e8b781",
  "com.scalablytyped" %%% "material__chips" % "0.35-dt-20180910Z-a203aa",
  "com.scalablytyped" %%% "material__dialog" % "0.35-dt-20180910Z-67a04a",
  "com.scalablytyped" %%% "material__drawer" % "0.35-dt-20180910Z-fb8197",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-7d4314",
  "com.scalablytyped" %%% "material__form-field" % "0.35-dt-20180910Z-d020c9",
  "com.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180910Z-ecfd43",
  "com.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180910Z-b103b9",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-5ade1d",
  "com.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180910Z-b196ac",
  "com.scalablytyped" %%% "material__menu" % "0.35-dt-20180910Z-d16e45",
  "com.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-d09d8c",
  "com.scalablytyped" %%% "material__radio" % "0.35-dt-20180910Z-a38a7d",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-4b74ab",
  "com.scalablytyped" %%% "material__select" % "0.35-dt-20180910Z-dfe945",
  "com.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-1a96c0",
  "com.scalablytyped" %%% "material__slider" % "0.35-dt-20180910Z-f05714",
  "com.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180910Z-ee8bf3",
  "com.scalablytyped" %%% "material__tabs" % "0.35-dt-20180910Z-ffe850",
  "com.scalablytyped" %%% "material__textfield" % "0.35-dt-20180910Z-cdd011",
  "com.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180910Z-e3b56f",
  "com.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180910Z-c0949b",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        