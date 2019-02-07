organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190119Z-810020"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-75fec6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-16a469",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-afbd10",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-a07e9b",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-006438",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190119Z-093960",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190119Z-6f58b4",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-95c2df",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-06e217",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-12c3cf",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-3c082c",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-5b8f23",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-03ccfe",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190119Z-93830e",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-cc1a08",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-1e5922",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-e4f05f",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-5ee154",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-b0d097",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-e934bd",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-cc7da4",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-61a2ef",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-7117aa",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190131Z-1621f5",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-4af5cb",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-55d285",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        